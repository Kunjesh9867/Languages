//
//  SecondViewController.swift
//  MultiviewControllers
//


import UIKit

class SecondViewController: UIViewController {

    @IBOutlet weak var txtCourseName: UITextField!
    
    @IBOutlet weak var lblOutput: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    @IBAction func btnDisplay(_ sender: UIButton) {
   
        lblOutput.text = txtCourseName.text!
    }
    
    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
