import 'package:flutter/material.dart';

import '../data/task_dao.dart';

class ShowDialog extends StatelessWidget {
  String title;
  String message;
  String param;

  ShowDialog(this.title, this.message, this.param,{Key? key}): super(key: key);

  @override
  Widget build(BuildContext context) {
    return AlertDialog(
      title: Text(title),
      icon: Icon(Icons.delete),
      content: Text(message),
      actions: <Widget>[
        TextButton(
          onPressed: () => Navigator.pop(context, 'Não'),
          child: const Text('Não'),
        ),
        TextButton(
          onPressed: () {
            TaskDao().delete(param);
            Navigator.pop(context, 'Sim');
            },
          child: const Text('Sim'),
        ),
      ],
    );
  }
}