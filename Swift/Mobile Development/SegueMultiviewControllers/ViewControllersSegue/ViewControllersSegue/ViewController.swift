//
//  ViewController.swift
//  ViewControllersSegue
//


import UIKit

class ViewController: UIViewController {
  // Creating Outlets
    
    @IBOutlet weak var textUsername: UITextField!
    
    @IBOutlet weak var textEmail: UITextField!
   
    // local variable
    var custName: String = ""
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
 // Action ..
    

    @IBAction func btnNextTapped(_ sender: UIButton) {
    performSegue(withIdentifier: "segueToProduct", sender: self)
        //custName = textUsername.text!
    
    } // end action
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        var vc = segue.destination as! ProductDetailsViewController
        vc.customerName = textUsername.text!
    }
} // end class

