   // home: Stack(
      //   alignment: AlignmentDirectional.center,
      //   children: [Container(color: Colors.red, width:100, height: 100), Container(color: Colors.blue, width:50, height: 50),]  )
      // home: Column(
      //   mainAxisAlignment: MainAxisAlignment.center,
      //   crossAxisAlignment: CrossAxisAlignment.center,
      //   children: [Container(color: Colors.red, width:100, height: 100), Container(color: Colors.blue, width:50, height: 50)],)
      // home: Row(
      //   mainAxisAlignment: MainAxisAlignment.spaceEvenly,
      //   crossAxisAlignment: CrossAxisAlignment.start,
      //   children: [Container(color: Colors.red, width:100, height: 100), Container(color: Colors.blue, width:50, height: 50)],)










// Container(
//         color: Colors.white,
//         child: Column(
//             mainAxisAlignment: MainAxisAlignment.spaceEvenly,
//             crossAxisAlignment: CrossAxisAlignment.center,
//             children: [
//               Stack(
//                 alignment: AlignmentDirectional.center,
//                 children: [
//                   Container(color: Colors.red, width: 100, height: 100),
//                   Container(color: Colors.blue, width: 50, height: 50)
//                 ],
//               ),
//               Stack(
//                 alignment: AlignmentDirectional.center,
//                 children: [
//                   Container(color: Colors.blue, width: 100, height: 100),
//                   Container(color: Colors.blue, width: 50, height: 50)
//                 ],
//               ),
//               Row(
//                 mainAxisAlignment: MainAxisAlignment.spaceEvenly,
//                 crossAxisAlignment: CrossAxisAlignment.center,
//                 children: [
//                   Container(
//                     color: Colors.cyan,
//                     height: 50,
//                     width: 50,
//                   ),
//                   Container(
//                     color: Colors.pinkAccent,
//                     height: 50,
//                     width: 50,
//                   ),
//                   Container(
//                     color: Colors.purple,
//                     height: 50,
//                     width: 50,
//                   ),
//                 ],
//               ),
//               Container(
//                 color: Colors.amber,
//                 height: 30,
//                 width: 300,
//                 child: const Text(
//                   "Diamante amarelos",
//                   style: TextStyle(color: Colors.black, fontSize: 27),
//                   textAlign: TextAlign.center,
//                 ),
//               ),
//               ElevatedButton(
//                   onPressed: () {
//                     print("Voce apertou o botao");
//                   },
//                   child: Text('Aperte o botao!'))
//             ]),
//       ),
//     );