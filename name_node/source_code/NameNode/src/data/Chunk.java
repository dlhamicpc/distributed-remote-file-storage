/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
 

/**
 *
 * @author dlham
 */
public class Chunk { 

    private long fileId;
    private long dataNodeId;
    private int part;
    private int replica;
    private long size;

    public long getFileId() {
        return fileId;
    }

    public void setFileId(long fileId) {
        this.fileId = fileId;
    }

    public long getDataNodeId() {
        return dataNodeId;
    }

    public void setDataNodeId(long dataNodeId) {
        this.dataNodeId = dataNodeId;
    }

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public int getReplica() {
        return replica;
    }

    public void setReplica(int replica) {
        this.replica = replica;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
  
}
