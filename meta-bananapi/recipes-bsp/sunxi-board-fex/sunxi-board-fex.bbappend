# Copyright (C) 2013 Tomas Novotny <novotny@rehivetech.com>
# Released under BSD-2-Clause or MIT license
# 这个是sdcard_image_sunxi依赖的

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " file://Bananapii.fex \
"
S = "${WORKDIR}"

