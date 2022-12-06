import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import '../components/task.dart';

class TaskInherited extends InheritedWidget {
  TaskInherited({
    Key? key,
    required Widget child,
  }) : super(key: key, child: child);

  static TaskInherited of(BuildContext context) {
    final TaskInherited? result = context.dependOnInheritedWidgetOfExactType<TaskInherited>();
    assert(result != null, 'No TaskInherited found in context');
    return result!;
  }

  final List<Task> taskList = [Task('Estudar Flutter', 'assets/images/dash.png', 4),
  Task('Andar de Bike', 'assets/images/bike.webp', 2),
  Task('Ler', 'assets/images/ler.jpg', 3),
  Task('Meditar', 'assets/images/meditar.jpeg', 1),
  Task('Jogar', 'assets/images/jogar.jpg', 1),];

  void newTask(String name, String photo, int difficulty)
  {
    taskList.add(Task(name, photo, difficulty));
  }
  @override
  bool updateShouldNotify(TaskInherited old) {
    return old.taskList.length != taskList.length;
  }
}
