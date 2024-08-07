// .... OPTIONALS EXAMPLES
import Cocoa

// .... OPTIONALS EXAMPLES
// if a variable is of type optional, then it's value can be nil. That means absence of value
//
// EXAMPLE 1.0:...
// No default values
// It must be initialized
var userName:String
//print(userName)
userName="Sujeet"
print(userName)

//.... Optionals
// Int?, Double?
var firstName:String? // string optional. it can contain a null value - i.e. nil
print(firstName)
firstName="Sujeet" // initialized
print(firstName)
print(firstName!) // you need to unwrap it. For unwrapping means using '!'

// Another way of declaring an optional - long form
let lastName: Optional<String> = "LOHAN"
print(lastName!)

// This is long form
let employeeNumber: Optional<Int> = Int("42")
print(employeeNumber!)
//..
let number: Int? = Optional.some(42) // has initial value 42
let noNumber: Int? = Optional.none // nil

print(noNumber == nil) // Prints "true"


//...EXAMPLE 02....

var errorCodeString: String?
errorCodeString = "an error occurred"
if errorCodeString != nil {
    let theError = errorCodeString! // this is unwrappping by use of "!"
    print(theError)
}
else {
     print("Value is nil")
}

//... EXAMPLE 03: OPTIONAL BINDING ( better alternative to Example 02)
// use of if let with Optionals
// theError is let constant

var errorCodeString2: String?
//errorCodeString2 = "an error occurred"
if let theError = errorCodeString2 {
    print(theError) // no wrapping of the value is required. This is an advantage
}
else
    {
    print("No Error")
    }

//... EXAMPLE 04: NESTED OPTIONAL BINDING
// use of if let with Optionals
// theError is let constant

var errorCodeMessage: String?
errorCodeMessage = "404"
if let theError = errorCodeMessage {
    if let errorCodeInteger = Int(theError) {
        print("\(theError): \(errorCodeInteger)")
    }
}

//... EXAMPLE 05: UNWRAPPING MULTIPLE OPTIONALS, rewriting the Example 04.

var errorCodeMessage2: String?
errorCodeMessage2 = "XYZ"
if let theError = errorCodeMessage2, let errorCodeInteger2 = Int(theError) {
        print("\(theError): \(errorCodeInteger2)")
    }

// ...EXAMPLE 06: Modifying an Optional in Place

var errorMessageDescription:String? = "Error Occured:"
errorMessageDescription?.uppercased()
errorMessageDescription?.append(" PLEASE TRY AGAIN.")
print(errorMessageDescription!)

// ...EXAMPLE 07:

var errorDescription: String? = "Error has occured:"
let description: String
if let errorDesc = errorDescription {
    description = errorDesc
    print(description)
} else {
    description = "No error"
}

//... EXAMPLE 08: Nil Coalescing Operator - '??' ( Use it in place of example 07: )
//
var errorOutputMessage:String?
//errorOutputMessage = "Key not found"
let errdescription = errorOutputMessage ?? "No error" // The value after the ?? acts as default value


// .... Optionals basics   ..//
//Ex-01:
var authorFirstName:String = "Sujeet" // this is normal string variable. It can not be null.
//It can not have null values. It must be initialized before you use it
print(authorFirstName)

authorFirstName = "Lohan" // it can be modified as it is variable and not a let constant
print(authorFirstName)

//Ex02:

var authorLastName:String? // this is String optional. Int? - Integer Optional, Double? - double optional
// If you don't initialize them then they can take up the value - null ( i.e. nil)
print(authorLastName)
authorLastName = "Georgian"
print(authorLastName)
print(authorLastName!) // this is unwrapping of an optional value by using operator "!"

// Ex03:

var authorMiddleName:String!// this is String optional. this is of the the forced unwrapping
// It assumes that there should always a value provided for middleName
//If you don't initialize them then they will cause run-time error
// You don't need to unwrap them
print((authorMiddleName))


// THEY WILL ASK IN THE INTERVIEW..
var fName:String // this a normal variable
//print(firstName)
firstName = "Steve"
print(firstName)

// This is an optional why because it is suffixed with ?.
// And this can accept null values represented by nil
var mName:String?
print(mName)
mName = "Pal"
print(mName)
print(mName!) // you need unwrap it

//
var lName:String!

let programName:String? = "Mobile App Development"
print(programName)
print(programName!) // unwrapping of an optional

let collegeName:String! = "Georgian"
print(collegeName) // unwrapping of an optional

// This is called optional binding by use of - if let
let Username:String? = "Sujeet"

if let uname = Username {   
    print(uname)
}

