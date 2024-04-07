//
//  ClientControllerViewController.swift
//  Exercise001
//
//  Created by Kunjesh Kantilal Ramani on 2023-11-06.
//

import UIKit

class ClientController: UIViewController {

    
    // Swift default load function
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    
    // Local String variable
    var loginUserName: String = ""

    
    // Variables
    @IBOutlet weak var projectName: UITextField!
    
    @IBOutlet weak var projectDuration: UITextField!
    
    @IBOutlet weak var projectLocation: UITextField!
    

    @IBOutlet weak var textarea: UITextView!
    
    
    // When Submit button is hit, it will display the value in the textarea
    @IBAction func submit(_ sender: Any) {
        if let projectNameText = projectName.text {
               textarea.text = "Username: \(loginUserName)\nProject Name: \(projectNameText)"
           } else {
               print("Error: Project name is empty.")
           }
    }
    
    
}
