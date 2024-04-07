//
//  ViewController.swift
//  Exercise001
//
//  Created by Kunjesh Kantilal Ramani on 2023-11-06.
//

import UIKit



// This is the first/Main controller or Login Page controller
class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    

    // Variables
    
    @IBOutlet weak var username: UITextField!
    
    @IBOutlet weak var password: UITextField!
    
    // Making the Segue connection
    
    @IBAction func btnLogin(_ sender: UIButton) {
        performSegue(withIdentifier: "segueToClient", sender: self)
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
          var vc = segue.destination as! ClientController
          vc.loginUserName = username.text!
      }
    
}

