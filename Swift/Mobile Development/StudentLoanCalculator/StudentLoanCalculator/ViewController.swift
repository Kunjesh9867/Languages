//
//  ViewController.swift
//  StudentLoanCalculator
//
//  Created by Sujeet Lohan
//

import UIKit

class ViewController: UIViewController {
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    
    @IBOutlet weak var labelForCalculating: UILabel!
    
    @IBOutlet weak var labelForMessage: UITextView!
    
    @IBOutlet weak var loanAmount: UITextField!
    @IBOutlet weak var rate: UITextField!
    @IBOutlet weak var years: UITextField!
    
    
    
    
    @IBAction func onActionCalculate(_ sender: Any) {
        //1
        labelForCalculating.text = String((Int(loanAmount.text!)! * Int(rate.text!)! * Int(years.text!)!) / 100)
        
        //2
    }
    
    
    
    
}
// TODO:
// Complete this app and it will help learn more about buiding iOS based app.
