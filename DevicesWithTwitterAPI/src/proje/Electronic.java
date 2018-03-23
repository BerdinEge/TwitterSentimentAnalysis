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
public abstract class Electronic implements Product{
    private int pId;
    private String pBrand;
    private String pModel;

    public void setpId(int pId) {
        this.pId = pId;
    }

    public void setpBrand(String pBrand) {
        this.pBrand = pBrand;
    }

    public void setpModel(String pModel) {
        this.pModel = pModel;
    }

    @Override
    public int getpId() {
        return pId;
    }

    @Override
    public String getpBrand() {
        return pBrand;
    }

    @Override
    public String getpModel() {
        return pModel;
    }

    public Electronic(int pId, String pBrand, String pModel) {
        this.pId = pId;
        this.pBrand = pBrand;
        this.pModel = pModel;
    }
    
   @Override
   public String toString() {return "Product [pId=" + pId + ", pBrand=" + pBrand + ", pModel=" + pModel + "]";}
    
}
