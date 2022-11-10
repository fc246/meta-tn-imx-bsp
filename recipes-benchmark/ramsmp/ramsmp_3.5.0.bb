DESCRIPTION = "RAMSMP Benchmark Program"
PR = "r0"
PRIORITY = "optional"
SECTION = "console/utils"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://LICENCE;md5=92cffec6695a20eab8d0e4770f4e9353"

SRC_URI = "http://sources.buildroot.net/ramsmp-${PV}.tar.gz \
          file://Makefile.patch;pnum=1 \
          "

MIRRORS += "http://sources.buildroot.net/ http://www.alasir.com/software/ramspeed/"

SRC_URI[md5sum] = "c26b32c752c603e17c28a1cab4348682"
SRC_URI[sha256sum] = "39fb15493fb3c293575746d56f6ab9faaa1d876d8b1f0d8e5a4042d2ace95839"

S = "${WORKDIR}/ramsmp-${PV}"

do_install(){
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/${PN}-${PV}/ramsmp  ${D}${bindir}
}
