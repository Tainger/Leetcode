package com.dytedance.design.compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiazhiyuan
 * @date 2021/9/27 11:03 下午
 */
public class FileSystemNode {
    private String path;
    private boolean isFile;
    private List<FileSystemNode> subNodes = new ArrayList<>();

    public FileSystemNode(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }


    public  int countNumOfFiles() {
        //TODO....
        return 0;
    }


    public long countSizeOfFiles() {
        //TODO..

        return 0;
    }

    public String getPath() {     return path;   }

    public void addSubNode(FileSystemNode fileSystemNode) {
        subNodes.add(fileSystemNode);
    }

    public void removeSubNode(FileSystemNode fileSystemNode) {
        int size = subNodes.size();
        int i = 0;
        for(; i < size; ++i ) {
            if(subNodes.get(i).getPath().equalsIgnoreCase(fileSystemNode.getPath())) {
                break;
            }
        }

        if(i < size) {
            subNodes.remove(i);
        }
    }

}



    
