//
//  ViewController.swift
//  Exercise01
//
//  Created by Het Panchal on 21/07/23.
//

import UIKit

class ViewController: UIViewController {
   

    // Declare arrays to store movie details
    var movieName = ["Guardians of Galaxy", "Interstellar", "fastX", "MI Fallout", "oppenheimer"]
    
    var releaseYear = ["2014", "2014", "2023", "2018", "2023"]
    
    let directorName = ["James Gunn", "Christopher Nolan", "Louis Leterrier", "Christopher McQuarrie", "Christopher Nolan"]
        
    let runTime = ["2h 2min", "2h 45min", "2h 21min", "2h 27min", "3h 0min"]

    @IBOutlet var tableview: UITableView!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
       
    }
    
}


// This allows ViewController to act as the delegate and data source for the table view.
extension ViewController: UITableViewDelegate, UITableViewDataSource {
    
    
    // This function returns the height of each row in the table view.
    func tableView(_ tableView: UITableView, heightForRowAt indexPath: IndexPath) -> CGFloat {
            return 135
        }
    
    
    // This function returns the number of rows in the table view.
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return movieName.count
    }
    
    
    // This function configures each cell in the table view.
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "cell", for: indexPath) as? CellTableViewCell
        cell?.movieName.text = movieName[indexPath.row]
        cell?.movieImage.image = UIImage(named: movieName[indexPath.row])
        cell?.releaseYear.text = releaseYear[indexPath.row]
        return cell!
    }
    
    
//    // This function is called when a user selects a row in the table view.
//    func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
//        let vc = storyboard?.instantiateViewController(identifier: "DetailsViewController") as? DetailsViewController
//        vc?.image = UIImage(named: movieName[indexPath.row])!
//        vc?.name = movieName[indexPath.row]
//        vc?.movieDirector = directorName[indexPath.row]
//        vc?.movieRelease = releaseYear[indexPath.row]
//        vc?.movieRunTime = runTime[indexPath.row]
//        self.navigationController?.pushViewController(vc!, animated: true)
//    }
}
