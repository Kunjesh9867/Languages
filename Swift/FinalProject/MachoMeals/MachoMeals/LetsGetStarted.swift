//
//  LetsGetStarted.swift
//  MachoMeals
//
//  Created by Kunjesh Kantilal Ramani on 2023-11-24.
//

import UIKit

class LetsGetStarted: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    
    @IBAction func loginpageBtn(_ sender: UIButton) {
        let loginPageVC = self.storyboard?.instantiateViewController(withIdentifier: "LoginPageViewController") as! LoginPageViewController
       // navigating to SecondViewController
        self.navigationController?.pushViewController(loginPageVC, animated: true)
    }
    
    
    @IBAction func registerpageBtn(_ sender: UIButton) {
        let RegistrationPageVC = self.storyboard?.instantiateViewController(withIdentifier: "RegistrationPageViewController") as! RegistrationPageViewController
       // navigating to SecondViewController
        self.navigationController?.pushViewController(RegistrationPageVC, animated: true)
    }
    
    

}

