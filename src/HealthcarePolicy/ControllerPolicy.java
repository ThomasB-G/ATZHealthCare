/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthcarePolicy;

import java.util.*;
import javax.swing.JOptionPane;




/**
 *
 * @author 
 */
public class ControllerPolicy {
    private ModelPolicy model;
    private PolicyView policyView;

    public ControllerPolicy() {
        this.policyView = new PolicyView(this);
        
        
        this.policyView.setVisible(true);
    }
    
    public void toExitButtonPushed(){
        this.policyView.dispose();
    }
        public void toHome(){
        this.policyView.dispose();
        
        Documents.ControllerDocs nextCntl = new Documents.ControllerDocs();
    }
    
    public void addPolicy(Policy newPolicy){
        this.model.addPolicy(newPolicy);
    }
    
    public LinkedList<Policy> getPolicies()
    {
        return this.model.getPolicies();
    }
    
    public void viewHipaa(){
        JOptionPane.showMessageDialog(policyView, "The Health Insurance Portability and Accountability Act of 1996 (HIPAA) \n" +
            "required the Secretary of the U.S. Department of Health and Human Services (\n" +
            "HHS) to develop regulations protecting the privacy and security of certain  \n" +
            "health information.1 To fulfill this requirement, HHS published what are  \n" +
            "commonly known as the HIPAA Privacy Rule and the HIPAA Security Rule. The  \n" +
            "Privacy Rule, or Standards for Privacy of Individually Identifiable Health  \n" +
            "Information, establishes national standards for the protection of certain  \n" +
            "health information. The Security Standards for the Protection of Electronic  \n" +
            "Protected Health Information (the Security Rule) establish a national set of  \n" +
            "security standards for protecting certain health information that is held or  \n" +
            "transferred in electronic form. The Security Rule operationalizes the  \n" +
            "protections contained in the Privacy Rule by addressing the technical and  \n" +
            "non-technical safeguards that organizations called “covered entities” must  \n" +
            "put in place to secure individuals’ “electronic protected health  \n" +
            "information” (e-PHI). Within HHS, the Office for Civil Rights (OCR) has  \n" +
            "responsibility for enforcing the Privacy and Security Rules with voluntary  \n" +
            "compliance activities and civil money penalties. \n" +
            "Prior to HIPAA, no generally accepted set of security standards or general  \n" +
            "requirements for protecting health information existed in the health care  \n" +
            "industry. At the same time, new technologies were evolving, and the health  \n" +
            "care industry began to move away from paper processes and rely more heavily  \n" +
            "on the use of electronic information systems to pay claims, answer  \n" +
            "eligibility questions, provide health information and conduct a host of  \n" +
            "other administrative and clinically based functions.  \n" +
            "\n" +
            "A major goal of the Security Rule is to protect the privacy of individuals’  \n" +
            "health information while allowing covered entities to adopt new technologies  \n" +
            "to improve the quality and efficiency of patient care. Given that the health  \n" +
            "care marketplace is diverse, the Security Rule is designed to be flexible  \n" +
            "and scalable so a covered entity can implement policies, procedures, and  \n" +
            "technologies that are appropriate for the entity’s particular size,  \n" +
            "organizational structure, and risks to consumers’ e-PHI.  \n");
    }
    
    
}
