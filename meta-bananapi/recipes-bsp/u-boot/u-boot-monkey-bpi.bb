DESCRIPTION = "U-Boot port for sunxi"

require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

# No patches for other machines yet

#这个必须写，这样才能执行`bitbake u-boot`
PROVIDES = "u-boot"

PR = "r0"
PV = "2014.04"

SRCBRANCH = "v2014.04"

SRC_URI = "git://github.com/hominlinx/uboot.git;protocol=git;branch=${SRCBRANCH} \
file://boot.cmd \
"
SRCREV = "42ef4fb6e28709b4802929572daecbbb2b73c4c8"

S = "${WORKDIR}/git"
SPL_BINARY="u-boot-sunxi-with-spl.bin"

UBOOT_ENV_SUFFIX = "scr"
UBOOT_ENV = "boot"


do_compile_append() {
    ${S}/tools/mkimage -C none -A arm -T script -d ${WORKDIR}/boot.cmd ${WORKDIR}/${UBOOT_ENV_BINARY}
}



