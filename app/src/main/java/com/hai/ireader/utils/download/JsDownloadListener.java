package com.hai.ireader.utils.download;

public interface JsDownloadListener {
    void onStartDownload(long length);

    void onProgress(int progress);

    void onFail(String errorInfo);
}
