package com.dc.springboot.bean;

import org.springframework.stereotype.Component;

/**
 * <pre>
 * {@code @Component}注解会自动注册bean，但是没有配置各种属性，因此这种bean其实是<i>功能型<i/>的
 * 它不是一种配置，而是一个service，这里也会再去依赖@Autowire别的服务，然后整个暴露给别人提供服务
 * 所以现在这种用法不合适
 * </pre>
 *
 * @Author: donglongcheng
 * @Description:
 * @Date: Create in 23:28 2019/7/14
 */
@Component
public class DcFile {

    private String fileName;

    private String md5;

    private long size;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "DcFile{" +
                "fileName='" + fileName + '\'' +
                ", md5='" + md5 + '\'' +
                ", size=" + size +
                '}';
    }
}
