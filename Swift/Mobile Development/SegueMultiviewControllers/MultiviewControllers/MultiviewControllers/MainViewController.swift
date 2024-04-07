//
//  ViewController.swift
//  MultiviewControllers
//
//

import UIKit

class MainViewController: UIViewController {

    @IBOutlet weak var txtName: UITextField!
    
    @IBOutlet weak var lblOutput: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


    @IBAction func btnPrint(_ sender: Any) {
        lblOutput.text = txtName.text!
        
    }
}

