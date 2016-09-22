require recipes-kernel/linux/linux.inc

DESCRIPTION = "Linux kernel for Allwinner a10/a20 processors"

COMPATIBLE_MACHINE = "(sun4i|sun5i|sun7i)"

PV = "3.4.90"
PR = "r1"
# Last tested version by myself
SRCREV_pn-${PN} = "e37d760b363888f3a65cd6455c99a75cac70a7b8"
SRCBRANCH = "lemaker-3.4"

MACHINE_KERNEL_PR_append = "a"

SRC_URI = "git://github.com/hominlinx/linux-bananapi.git;protocol=git;branch=${SRCBRANCH} \
           file://defconfig \
          "
SRCREV = "e594996b0156b72ea559e035a3c1e396850fb384"

S = "${WORKDIR}/git"

#fix QA issue "Files/directories were installed but not shipped: /usr/src/debug"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

