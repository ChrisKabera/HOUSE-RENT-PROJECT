/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package House.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author GRACE
 */

 @Entity
public class atrr {
     @Id
    private String RoomNo;
    private String Width;
    private String Length;
    private String Floor;

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String RoomNo) {
        this.RoomNo = RoomNo;
    }

    public String getWidth() {
        return Width;
    }

    public void setWidth(String Width) {
        this.Width = Width;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String Length) {
        this.Length = Length;
    }

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String Floor) {
        this.Floor = Floor;
    }
     

    
    
}
