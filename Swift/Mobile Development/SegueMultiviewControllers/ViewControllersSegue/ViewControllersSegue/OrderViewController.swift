//
//  OrderViewController.swift
//  ViewControllersSegue
//


import UIKit

class OrderViewController: UIViewController {

    // Outlets..
    
    @IBOutlet weak var labelCustName: UILabel!
    
    @IBOutlet weak var labelProductName: UILabel!
    
    @IBOutlet weak var labelPrice: UILabel!
   
    // local variables
    var custName:String = ""
    var productName:String = ""
    var price:String = ""
    
    override func viewDidLoad() {
        super.viewDidLoad()
   // assigning the values to the properties
        labelCustName.text = custName
        labelProductName.text = productName
        labelPrice.text = price
        
        // Do any additional setup after loading the view.
    }
    

    @IBAction func btnExitTapped(_ sender: UIButton) {
        
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
