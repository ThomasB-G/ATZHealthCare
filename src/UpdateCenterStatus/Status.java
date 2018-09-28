/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdateCenterStatus;

/**
 *
 * @author russell
 */
public class Status {
    private String status;
    private int statusLvl;

    public Status(String status, int statusLvl) {
        this.status = status;
        this.statusLvl = statusLvl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusLvl() {
        return statusLvl;
    }

    public void setStatusLvl(int statusLvl) {
        this.statusLvl = statusLvl;
    }
    
    
}
