// Time.swift
// Time class with overloaded designated and convenience initializers.
// This is about - designated and convenience initializers.

public class Time {
    // an hour value in the range 0-23
    public var hour: Int = 0 {
        // No willSet
        didSet {
            if hour < 0 || hour > 23 {
                hour = oldValue
            }
        } // end didSet
    } // end property
    
    // a minute value in the range 0-59
    public var minute: Int = 0 {
        didSet {
            if minute < 0 || minute > 59 {
                minute = oldValue
            }
        }
    } // end property
    
    // a second value in the range 0-59
    public var second: Int = 0 {
        didSet {
            if second < 0 || second > 59 {
                second = oldValue
            }
        }
    } // end property
    
    // designated initializer: sets each stored property to default value
    public init() { } // empty body
    
    // designated initializer: sets all the stored properties to specified values
    public init(hour: Int, minute: Int, second: Int) {
        // add validations here. Check if hour is between > 0 and < 24
        self.hour = hour
        self.minute = minute
        self.second = second
        // No validations here. You need to add that
    }
 
}

