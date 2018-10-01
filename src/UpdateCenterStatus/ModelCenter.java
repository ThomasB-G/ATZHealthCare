/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdateCenterStatus;

import java.util.*;
import java.io.*;

/**
 *
 * @author russell
 */
public class ModelCenter {
    private LinkedList<Status> statuses;

    public ModelCenter(LinkedList<Status> statuses) {
        this.statuses = statuses;
    }

    public LinkedList<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(LinkedList<Status> statuses) {
        this.statuses = statuses;
    }
    public void addStatus(Status status) {
        this.statuses.add(status);
    }
    
    
}
