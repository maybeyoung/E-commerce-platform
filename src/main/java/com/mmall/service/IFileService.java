package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: wsj
 * @Description:文件上传接口
 * @Modified by:
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
