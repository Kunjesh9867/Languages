//
//  ProductDetailsViewController.swift
//  ViewControllersSegue
//


import UIKit

class ProductDetailsViewController: UIViewController {

   // Outlets ..
    @IBOutlet weak var labelCustomerName: UILabel!
    
    @IBOutlet weak var textPrice: UITextField!
    
    @IBOutlet weak var textProductName: UITextField!
    // local variables
    var customerName: String = ""
    
    override func viewDidLoad() {
        super.viewDidLoad()
        labelCustomerName.text = customerName
        // Do any additional setup after loading the view.
    }
    
    @IBAction func btnConfirmTapped(_ sender: UIButton) {
    performSegue(withIdentifier: "segueToOrder", sender: self)
    
    } // end Action
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        var vcPD = segue.destination as! OrderViewController
        vcPD.custName = customerName
       // vcPD.custName = labelCustomerName.text!
        
        vcPD.productName = textProductName.text!
        vcPD.price = textPrice.text!
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
