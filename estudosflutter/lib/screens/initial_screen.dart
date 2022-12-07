import 'package:estudosflutter/data/task_dao.dart';
import 'package:estudosflutter/data/task_inherited.dart';
import 'package:estudosflutter/screens/form_screen.dart';
import 'package:flutter/material.dart';

import '../components/task.dart';

class InitialScreen extends StatefulWidget {
  const InitialScreen({super.key});

  @override
  State<InitialScreen> createState() => _InitialScreenState();
}

class _InitialScreenState extends State<InitialScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Tarefas'),
        leading: Container(),
        actions: [IconButton(onPressed: (){setState(() {
          
        });}, icon: Icon(Icons.refresh))],
      ),
      body: Padding(
        padding: EdgeInsets.only(top: 8, bottom: 70),
        child: FutureBuilder<List<Task>>(
            future: TaskDao().findAll(),
            builder: (context, snapshot) {
              List<Task>? items = snapshot.data;
              switch (snapshot.connectionState) {
                case ConnectionState.none:
                  return Center(
                    child: Column(children: [
                      CircularProgressIndicator(),
                      Text('Carregando')
                    ]),
                  );
                  break;
                case ConnectionState.waiting:
                  return Center(
                    child: Column(children: [
                      CircularProgressIndicator(),
                      Text('Carregando')
                    ]),
                  );
                  break;
                case ConnectionState.active:
                  return Center(
                    child: Column(children: [
                      CircularProgressIndicator(),
                      Text('Carregando')
                    ]),
                  );
                  break;
                case ConnectionState.done:
                  if (snapshot.hasData && items != null) {
                    if (items.isNotEmpty) {
                      return ListView.builder(
                          itemCount: items.length,
                          itemBuilder: (BuildContext context, int index) {
                            final Task tarefa = items[index];
                            return tarefa;
                          });
                    }
                    return Center(
                      child: Column(
                        children: [
                          Icon(Icons.error_outline, size: 128),
                          Text(
                            'Sem tarefas',
                            style: TextStyle(fontSize: 32),
                          ),
                        ],
                      ),
                    );
                  }
                  return Text('Error ao carregar tarefas');
                  break;
              }
              return Text('Erro desconhecido');
            }),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          Navigator.push(
            context,
            MaterialPageRoute(
              builder: (contextnew) => FormScreen(
                taskContext: context,
              ),
            ),
          ).then((value) => setState(() {
                print('Atualizando estado da tela');
              }));
        },
        child: const Icon(Icons.add),
      ),
    );
  }
}
