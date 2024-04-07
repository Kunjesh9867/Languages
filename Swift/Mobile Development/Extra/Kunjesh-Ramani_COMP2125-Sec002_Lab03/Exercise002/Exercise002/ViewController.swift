//
//  ViewController.swift
//  Exercise002
//
//  Created by Kunjesh Kantilal Ramani on 2023-11-04.
//

import UIKit

class ViewController: UIViewController {

    
    // Swift Default Load function
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    // To toggle between light/dark mode
    
    @IBOutlet var viewToChangeColor: UIView!
    
    
    @IBAction func segmentedControlValueChanged(_ sender: UISegmentedControl) {
        
        if (sender.selectedSegmentIndex == 0){
            viewToChangeColor.backgroundColor = UIColor.white
            
            tipPercentage.backgroundColor = UIColor.white
        }
        else {
            viewToChangeColor.backgroundColor = UIColor.lightGray
            
            tipPercentage.backgroundColor = UIColor.lightGray
            
        }
    }
    
    
    // Variables

    @IBOutlet weak var segmentedControl: UISegmentedControl!
    
    
    @IBOutlet weak var amount: UITextField!
  
    @IBOutlet weak var tipPercentage: UILabel!
    
    @IBOutlet weak var tipLabel1: UILabel!
    
    
    @IBOutlet weak var tipLabel2: UILabel!
    
    
    @IBOutlet weak var total2: UILabel!
    
    @IBOutlet weak var total1: UILabel!
    
    
    
    
    @IBOutlet weak var customTipLabel: UILabel!
    
    

    
    // When the slider changes, this function will be executed
    @IBAction func sliderTipCalc(_ sender: UISlider) {
        var resultString: String
            if let unwrappedAmount = amount?.text, !unwrappedAmount.isEmpty {
                resultString = unwrappedAmount
                print(resultString)
                
                tipPercentage.text = Int(round(sender.value)).description + "%"
                
                tipLabel1.text = "$" +  String(format: "%.2f", Double(resultString)! * Double(0.15));
                total1.text = "$" + String(format: "%.2f", Double(resultString)! * Double(1.15))
                
               
                customTipLabel.text = tipPercentage.text!
                
                let tipAmountCustom =  Double(round(sender.value)/100) * Double(resultString)!
                tipLabel2.text = "$" + String(format: "%.2f", tipAmountCustom)
                total2.text = "$" + String(format: "%.2f", tipAmountCustom + Double(resultString)!)
         
            } else {
                tipPercentage.text = Int(round(sender.value)).description + "%"
                customTipLabel.text = Int(round(sender.value)).description + "%"
            }
    }
    
    
}

