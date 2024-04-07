//
//  TimeExtensions.swift
//  TimeInitializers
//
//  Created by Samaye on 2021-06-07.
//  Copyright © 2021 Deitel & Associates, Inc. All rights reserved.
//

import Foundation

extension Time {
public convenience init(hour: Int)
{
  self.init(hour: hour, minute: 0, second: 0)
}

/*
public  init(hour: Int) {
    self.hour = hour
    self.minute = 0
    self.second = 0
}
*/
// convenience initializer: hour and minute supplied, second set to 0
public convenience init(hour: Int, minute: Int) {
    self.init(hour: hour, minute: minute, second: 0)
}
/*
public  init(hour: Int, minute: Int) {
    //self.init(hour: hour, minute: minute, second: 0)
     self.hour = hour
     self.minute = minute
     self.second = 0
}
*/
// convenience initializer: another Time object supplied
public convenience init(time: Time) {
    self.init(hour: time.hour, minute: time.minute,
        second: time.second)
}


} // end class
