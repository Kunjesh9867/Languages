//
//  TimeClassExtensions.swift
//  TimeExtension
//
//  Created by Sujeet Lohan on 2020-10-05.
//  Copyright © 2020 Deitel & Associates, Inc. All rights reserved.
//

import Foundation
// extension to class Time containing convenience initializers
extension Time {
    // convenience initializer: hour supplied, minute and second set to 0
    public convenience init(hour: Int) {
        self.init(hour: hour, minute: 0, second: 0) // call the designated initializer
    }
    
    // convenience initializer: hour and minute supplied, second set to 0
    public convenience init(hour: Int, minute: Int) {
        self.init(hour: hour, minute: minute, second: 0)
        
    }
    
    // add functions
    
   
} // end extension class Time








