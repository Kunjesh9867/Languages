//
//  CellTableViewCell.swift
//  Exercise01
//
//  Created by Het Panchal on 22/07/23.
//

import UIKit

class CellTableViewCell: UITableViewCell {

    // IBOutlet for the UIImageView to display the movie poster/image.
    @IBOutlet weak var movieImage: UIImageView!
    
    // IBOutlet for the UILabel to display the movie name.
    @IBOutlet weak var movieName: UILabel!
    
    // IBOutlet for the UILabel to display the release year of the movie.
    @IBOutlet weak var releaseYear: UILabel!
    
    override func awakeFromNib() {
        super.awakeFromNib()
        // Initialization code
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)

        // Configure the view for the selected state
    }

}
