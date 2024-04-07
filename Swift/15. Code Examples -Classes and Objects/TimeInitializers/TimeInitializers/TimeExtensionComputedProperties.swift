//
//  TimeExtensionComputedProperties.swift
//  TimeInitializers
//
//  Created by Samaye on 2021-06-07.
//  Copyright © 2021 Deitel & Associates, Inc. All rights reserved.
//

import Foundation
extension Time {
// Computed property - universalDescription. It is read only.
// not get and set means - get is implicit
// convert to String in universal-time format (HH:MM:SS)
public var universalDescription: String {
    return String(format: "%02d:%02d:%02d", hour, minute, second)
}

// Computed property - description. It is read only
// convert to String in standard-time format (H:MM:SS AM or PM)
public var description: String {
    return String(format: "%d:%02d:%02d %@",
        ((hour == 0 || hour == 12) ? 12 : hour % 12),
        minute, second, (hour < 12 ? "AM" : "PM"))
}
} // end class
