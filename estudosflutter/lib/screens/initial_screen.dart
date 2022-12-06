import 'package:estudosflutter/screens/form_screem.dart';
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
      ),
      body: ListView(
        children: const [
          Padding(
            padding: EdgeInsets.only(top: 8),
            child: Tasks('Estudar Flutter', 'assets/images/dash.png', 4),
          ),
          Tasks('Andar de Bike', 'assets/images/bike.webp', 2),
          Tasks('Ler', 'assets/images/ler.jpg', 3),
          Tasks('Meditar', 'assets/images/meditar.jpeg', 1),
          Tasks('Jogar', 'assets/images/jogar.jpg', 1),
          SizedBox(
            height: 80,
          ),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          Navigator.push(
            context,
            MaterialPageRoute(builder: (context) => FormScreen()),
          );
        },
        child: const Icon(Icons.add),
      ),
    );
  }
}
