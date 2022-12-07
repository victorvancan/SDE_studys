import 'package:estudosflutter/data/task_dao.dart';
import 'package:sqflite/sqflite.dart';
import 'package:sqflite/sqlite_api.dart';
import 'package:path/path.dart';


Future<Database> getDataBase() async {
  final String path = join(await getDatabasesPath(), 'task.db');

  return openDatabase(
    path,
    onCreate: ((db, version) {
      db.execute(TaskDao.tableSQL);
    }),
    version: 1,
  );
}

