/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

/**
 *
 * @author cagin
 */
public class ElectronicFactory {
    
    public Electronic getNameType(String ElectronicType){
      if(ElectronicType == null){
         return null;
      }		
      if(ElectronicType.equalsIgnoreCase("CellPhone")){
         return new CellPhone(0,0,"",0,"","");
         
      } else if(ElectronicType.equalsIgnoreCase("PC")){
         return new PC(0,0,"",0,"","");
         
      }return null;
    }
    
    public Electronic getAutomaticElection(int cameraSize, int ramSize, String OS, int pId, String pBrand, String pModel){
    if(OS.equals("Android")||OS.equals("IOS"))
    return new CellPhone( cameraSize,  ramSize,  OS,  pId,  pBrand,  pModel);
    else
    return new PC( cameraSize,  ramSize,  OS,  pId,  pBrand,  pModel);
    }
    
}
