package com.cpx.service

import com.yk09.sunvision.cpx.components.document.Document

class CpxService {

    companion object {
        fun createJpg(document: Document): ByteArray {
            return document.toJpg()
        }
    }
}