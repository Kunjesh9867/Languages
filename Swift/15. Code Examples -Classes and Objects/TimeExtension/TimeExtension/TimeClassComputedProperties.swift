//
//  TimeClassComputedProperties.swift
//  TimeExtension
//
//  Created by Samaye on 2021-06-07.
//  Copyright © 2021 Deitel & Associates, Inc. All rights reserved.
//

import Foundation
// extensions for String representations of a Time
extension Time {
    // convert to String in universal-time format (HH:MM:SS)
    public var universalDescription: String {
        return String(format: "%02d:%02d:%02d", hour, minute, second)
    }
    
    // convert to String in standard-time format (H:MM:SS AM or PM)
    public var description: String {
        return String(format: "%d:%02d:%02d %@",
            ((hour == 0 || hour == 12) ? 12 : hour % 12),
            minute, second, (hour < 12 ? "AM" : "PM"))
    }
} // end extension class Time
