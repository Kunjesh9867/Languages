//
//  ThirdViewController.swift
//  MultiviewControllers
//

import UIKit

class ThirdViewController: UIViewController {
// Oulets...
    
    @IBOutlet weak var txtProgramName: UITextField!
    
    @IBOutlet weak var lblOutput: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    //Actions:
    
    @IBAction func btnShow(_ sender: UIButton) {
        lblOutput.text = txtProgramName.text!
        
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
