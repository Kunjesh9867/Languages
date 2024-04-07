//
//  FeedbackViewController.swift
//  NavigatonControllerExample01
//
//  Created by Sujeet Lohan on 2020-07-05.
//  Copyright © 2020 Georgian College. All rights reserved.
//

import UIKit

class FeedbackViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
 
    @IBAction func btnExitTapped(_ sender: UIButton) {
   
        presentingViewController?.dismiss(animated: true, completion: nil)
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
