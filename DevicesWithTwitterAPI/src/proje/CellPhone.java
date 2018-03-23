/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;
public  class CellPhone extends Electronic {
    
	private int cameraSize;
	private int ramSize; 
        private String OS;
    
   
    public CellPhone(int cameraSize, int ramSize, String OS, int pId, String pBrand, String pModel) {
        super(pId, pBrand, pModel);
        this.cameraSize = cameraSize;
        this.ramSize = ramSize;
        this.OS = OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getOS() {
        return OS;
    }
       
     	public int getCameraSize() {return cameraSize;}
        public void setCameraSize(int cameraSize) {this.cameraSize = cameraSize;}
        public int getRamSize() {return ramSize;}
        public void setRamSize(int ramSize) {this.ramSize = ramSize;}
        @Override
	public String toString() {
		return super.toString() + " --CellPhone [cameraSize=" + cameraSize + ", ramSize=" + ramSize +" OS="+OS+ "]";
	}


}