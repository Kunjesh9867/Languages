//
//  TimeClassExtensions02.swift
//  TimeExtension
//
//  Created by Samaye on 2021-06-07.
//  Copyright © 2021 Deitel & Associates, Inc. All rights reserved.
//

import Foundation

extension Time {
// convenience initializer: use values from existing Time object
public convenience init(time: Time) {
    self.init(hour: time.hour, minute: time.minute,
        second: time.second)
}
} // end class Tim
