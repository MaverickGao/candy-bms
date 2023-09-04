package com.gzh.candy_bms.controller;

import com.gzh.candy_bms.tencentcloud.TencentCloudVideoHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 视频播放调研
 *
 * @author gaozhiheng
 */
@RestController
public class VideoTestController {

    @Resource
    private TencentCloudVideoHelper tencentCloudVideoHelper;

    /**
     * 视频样例文件地址
     */
    private final static String FILE_PATH = "";

    /**
     * 上传文件测试
     *
     * @param file     待上传文件
     * @param request  /
     * @param response /
     */
    @PostMapping("/video/test/upload-video-file")
    public void playVideoWithIOStream(@RequestPart("file") MultipartFile file, HttpServletRequest request, HttpServletResponse response) {
        tencentCloudVideoHelper.upload(file);
    }
}
