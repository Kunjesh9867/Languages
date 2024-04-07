//References: IOS How to Develop by Deitel and Deitel
// Access modifiers can be public, internal or private

public class Account {
    
//    public private(set) var accountNumber: Int = 0
//    public private(set) var SIN: Int = 0
  //   private var customerNumber: Int = 0
    
    public var name: String = ""// A stored property must be initialized

    //private(set) var accountNumber:Int = 0
    // TO DO: Add more stored properties as per requirements
   // public var ID:Int = 1234
   // public var address:String = ""
   // public var rate:Double = 2.5
   // public var timePeriod:Double = 0.0
    
    // balance is public, but it's setter is private and can be used only in class Account
    // private(set) - makes it read only
    // This is similar to read-only property in C#
   public private(set) var balance: Double = 0.0 // default value
    
    // initializer also known as constructors in C#/Java.
    // Keyword is init
    // Can be overloaded
    // Automatically invoked with the creation of an object
    public init(name: String, balance: Double) {
        self.name = name // self is equivalent to 'this' keyword in java and c#
        
        // validate that balance is greater than 0.0; if not,
        // property balance keeps its initial value of 0.0
        
       if balance > 10.0 {
            self.balance = balance
        }
    } // end init()
    
    // parameterless initializer
    public init() { }
    
    // deposit (add) a valid amount into the Account
    public func deposit(amount: Double) {
        // if amount is valid, add it to the balance
        if amount > 0.0 {
            balance = balance + amount
        }
       
    } // end method
    
    // withdraw (subtract) a valid amount from the Account
    // With every withdrawal there is $1.00 is charged
    public func withdraw(amount: Double) {
        // if amount is valid, and the balance will not
        // become negative, subtract it from the balance
        if amount > 0.0 {
            if  balance - amount >= 0.0 {
                balance = balance - amount
            }
//            else {
//                print("Not sufficient Balance")
//            }
        }
    } // end method
    
    
} // end class
