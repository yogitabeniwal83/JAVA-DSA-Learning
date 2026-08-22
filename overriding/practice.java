package overriding;

public class practice {
    // CASE-1

// same no. of agrs

// public class overriding {
//     void show()
//     {
//         System.out.println("1");
//     }
// }
// class Test extends overriding {
//     void show()
//     {
//         System.out.println("2");
//     }
    
//     public static void main(String[] args) {
//         overriding o = new overriding();
//         o.show();

//         Test t = new Test();
//         t.show();
//     }
// }



// same types of args

// public class overriding {
//     void show(int a)
//     {
//         System.out.println("1");
//     }
// }
// class Test extends overriding {
//     void show(int a)
//     {
//         System.out.println("2");
//     }
    
//     public static void main(String[] args) {
//         overriding o = new overriding();
//         o.show(10);

//         Test t = new Test();
//         t.show(10);
//     }
// }



// same sequence of args

// public class overriding {
//     void show(int a, String b)
//     {
//         System.out.println("1");
//     }
// }
// class Test extends overriding {
//     void show(int a, String b)
//     {
//         System.out.println("2");
//     }
    
//     public static void main(String[] args) {
//         overriding o = new overriding();
//         o.show(10,"abc");

//         Test t = new Test();
//         t.show(20, "abc");
//     }
// }



// different return type

// class Test {
//     Object show() 
//     {
//         System.out.println("1");
//         return null; 
//     }
// }

// class XYZ extends Test {
//     String show() {
//         System.out.println("2");
//         return null;
//     }

//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show();

//         XYZ x = new XYZ();
//         x.show();
//     }
// }






// CASE-2
// relation between access-modifier and overriding

// class Test {
//   protected void show() 
//     {
//         System.out.println("1");
     
//     }
// }

// class XYZ extends {
//    public void show() {
//         System.out.println("2");
       
//     }

//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show();

//         XYZ x = new XYZ();
//         x.show();
//     }
// }




// class Test {
//      void show() 
//       {
//           System.out.println("1");
       
//       }
//   }
  
//   class XYZ extends {
//      public void show() {
//           System.out.println("2");
         
//       }
  
//       public static void main(String[] args) {
//           Test t = new Test();
//           t.show();
  
//           XYZ x = new XYZ();
//           x.show();
//       }
//   }
  
  
  
  
// class Test {
//     protected void show() 
//       {
//           System.out.println("1");
       
//       }
//   }
  
//   class XYZ extends Test {
//      public void show() {
//           System.out.println("2");
         
//       }
  
//       protected static void main(String[] args) {
//           Test t = new Test();
//           t.show();
  
//           XYZ x = new XYZ();
//           x.show();
//       }
//   }
  
  
  
// class Test {
//     public void show() 
//       {
//           System.out.println("1");
//       }
//   }
  
//   class XYZ extends Test {
//       void show() {
//           System.out.println("2");
//       }
  
//       public static void main(String[] args) {
//           Test t = new Test();
//           t.show();
  
//           XYZ x = new XYZ(); 
//           x.show();
//       }
//   }
  

  

//   CASE-3
// overriding and exception-handling

// RULE 1 



// class Test {
//     void show() 
//       {
//           System.out.println("1");
       
//       }
//   }
  
//   class XYZ extends Test
// {
//       void show() throws ArithmeticException       // unchecked exception
//       {
//           System.out.println("2");
         
//       }
  
//       public static void main(String[] args) {
//           Test t = new Test();
//           t.show();
  
//           XYZ x = new XYZ();
//           x.show();
//       }
//   }
  
  

// class Test {
//      void show() 
//       {
//           System.out.println("1");
       
//       }
//   }
  
//   class XYZ extends Test
// {
//       void show() throws Exception                       //   checked exception , override method can not throws exception
//       {
//           System.out.println("2");
         
//       }
  
//       public static void main(String[] args) {
//           Test t = new Test();
//           t.show();
  
//           XYZ x = new XYZ();
//           x.show();
//       }
//   }
  



// RULE 2


// class Test {
//      void show() throws RuntimeException
//       {
//           System.out.println("1");
       
//       }
//   }
  
//   class XYZ extends Test
// {
//      void show() throws RuntimeException
//      {
//           System.out.println("2");
         
//       }
  
//       public static void main(String[] args) {
//           Test t = new Test();
//           t.show();
  
//           XYZ x = new XYZ();
//           x.show();
//       }
//   }
  
  


// class Test {
//     void show() throws RuntimeException
//      {
//          System.out.println("1");
      
//      }
//  }
 
//  class XYZ extends Test 
// {
//     void show() throws ArithmeticException
//     {
//          System.out.println("2");
        
//      }
 
//      public static void main(String[] args) {
//          Test t = new Test();
//          t.show();
 
//          XYZ x = new XYZ();
//          x.show();
//      }
//  }
 




// class Test {
//     void show() throws RuntimeException
//      {
//          System.out.println("1");
      
//      }
//  }
 
//  class XYZ extends Test 
// {
//     void show() throws Exception
//     {
//          System.out.println("2");
        
//      }
 
//      public static void main(String[] args) {
//          Test t = new Test();
//          t.show();
 
//          XYZ x = new XYZ();
//          x.show();
//      }
//  }                                                          // it can not compile
 
  



//  CASE-4
// overriding and abstract method


// abstract class Test {
//     abstract void display();
//     void show() throws RuntimeException
//      {
//          System.out.println("1");
      
//      }
//  }
 
//  class XYZ extends Test{
//     void display() {

//     }
//     void show()
//     {
//          System.out.println("2");
        
//      }
 
//      public static void main(String[] args) {
//         //  Test t = new Test();
//         //  t.show();
 
//          XYZ x = new XYZ();
//          x.show();
//      }
//  }
  
  


// interface I1 {
//     void display1();
// }
// abstract class Test {
//     abstract void display();
//     void show() throws RuntimeException
//      {
//          System.out.println("1");
      
//      }
//  }
 
//  class XYZ {
//     void display() {

//     }
//     void show()
//     {
//          System.out.println("2");
        
//      }
 
//      public static void main(String[] args) {
//         //  Test t = new Test();
//         //  t.show();
 
//          XYZ x = new XYZ();
//          x.show();
//      }
//  }
  
  
  


// CASE-5
// invoking overridden method from sub-class 


// class Test {
//     void show() {
//         System.out.println("1");
//     }
// }
// class XYZ extends Test {
//     void show() {
//         super.show();
//         System.out.println("2");
//     }

//     public static void main(String[] args) {
//         XYZ x = new XYZ();
//         x.show();
//     }
// }





// CASE-6
// which methods can not override


// class Test {
//      final void show() {
//         System.out.println("1");
//     }
// }
// class XYZ extends Test {
//     void show() {
//         System.out.println("2");
//     }

//     public static void main(String[] args) {
//         XYZ x = new XYZ();
//         x.show();
//     }
// }                                                       // final method can not be override




// class Test {
//     static void show() {
//        System.out.println("1");
//    }
// }
// class XYZ extends Test {
//    void show() {
//        System.out.println("2");
//    }

//    public static void main(String[] args) {
//        XYZ x = new XYZ();
//        x.show();
//    }
// }                                                         // static method can  not be override 

  



// class Test {
//     private void show() {
//        System.out.println("1");
//    }
// }
// class XYZ extends Test {
//    void show() {
//        System.out.println("2");
//    }

//    public static void main(String[] args) {
//        XYZ x = new XYZ();
//        x.show();
//    }
// }     
  
  
  

// CASE-7 
// overriding and synchronized / strictfp
  

// class Test {
//     synchronized void show() {
//        System.out.println("1");
//    }
// }
// class XYZ extends Test {
//    void show() {
//        System.out.println("2");
//    }

//    public static void main(String[] args) {
//        Test t = new Test();
//        t.show();
//        XYZ x = new XYZ();
//        x.show();
//    }                                                          o/p = 1
// }                                                                   2




// class Test {
//    void show() {
//        System.out.println("1");
//    }
// }
// class XYZ extends Test {
//     synchronized void show() {
//        System.out.println("2");
//    }

//    public static void main(String[] args) {
//        Test t = new Test();
//        t.show();
//        XYZ x = new XYZ();
//        x.show();
//    }                                                              o/p = 1
// }                                                                       2




// class Test {
//    strictfp void show() 
//    {
//         System.out.println("1");
//     }
//  }
//  class XYZ extends Test {
//     void show()
//      {
//         System.out.println("2");
//     }
 
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show();

//         XYZ x = new XYZ();
//         x.show();
//     }                                               o/p = 1
//  }                                                        2  






// class Test {
//      void show() 
//     {
//          System.out.println("1");
//      }
//   }
//   class XYZ extends Test {
//     strictfp void show()
//       {
//          System.out.println("2");
//      }
  
//      public static void main(String[] args) {
//          Test t = new Test();
//          t.show();
         
//          XYZ x = new XYZ();
//          x.show();
//      }
//   }                                                            o/p = 1
//                                                                      2
    
}
