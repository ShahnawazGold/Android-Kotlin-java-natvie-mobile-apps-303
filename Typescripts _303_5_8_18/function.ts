


// function test() { 
//     console.log("function called"); 
//  } 
//  test();    // function invocation



 //===========RETURN TYPE FUNCTION=======

//  function greet():any { //the function returns a string 
//     return "Hello World" 
//  } 

 
//  function caller() { 
//     var msg = greet() //function greet() invoked 
//     console.log(msg) 
//  } 

//  //invoke function 
//  caller()

// function test_param(n1 :number, s1 :string) {
//     console.log(n1);
//     console.log(s1);
//  }


//  test_param(123, "this is a string");
var names :string;

function  setName (Sname :string) :void{
       this.names =Sname;
}

function getNAME (): string {
    return this.names;
}

setName("shah");
getNAME();

console.log(getNAME());


 



