/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBlendColorPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glBlendEquationPROC) (jint);
typedef void (APIENTRY *glFogCoordfPROC) (jfloat);
typedef void (APIENTRY *glFogCoorddPROC) (jdouble);
typedef void (APIENTRY *glFogCoordfvPROC) (intptr_t);
typedef void (APIENTRY *glFogCoorddvPROC) (intptr_t);
typedef void (APIENTRY *glFogCoordPointerPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glMultiDrawArraysPROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glMultiDrawElementsPROC) (jint, intptr_t, jint, intptr_t, jint);
typedef void (APIENTRY *glPointParameterfPROC) (jint, jfloat);
typedef void (APIENTRY *glPointParameteriPROC) (jint, jint);
typedef void (APIENTRY *glPointParameterfvPROC) (jint, intptr_t);
typedef void (APIENTRY *glPointParameterivPROC) (jint, intptr_t);
typedef void (APIENTRY *glSecondaryColor3bPROC) (jbyte, jbyte, jbyte);
typedef void (APIENTRY *glSecondaryColor3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glSecondaryColor3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glSecondaryColor3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glSecondaryColor3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glSecondaryColor3ubPROC) (jbyte, jbyte, jbyte);
typedef void (APIENTRY *glSecondaryColor3usPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glSecondaryColor3uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glSecondaryColor3bvPROC) (intptr_t);
typedef void (APIENTRY *glSecondaryColor3svPROC) (intptr_t);
typedef void (APIENTRY *glSecondaryColor3ivPROC) (intptr_t);
typedef void (APIENTRY *glSecondaryColor3fvPROC) (intptr_t);
typedef void (APIENTRY *glSecondaryColor3dvPROC) (intptr_t);
typedef void (APIENTRY *glSecondaryColor3ubvPROC) (intptr_t);
typedef void (APIENTRY *glSecondaryColor3usvPROC) (intptr_t);
typedef void (APIENTRY *glSecondaryColor3uivPROC) (intptr_t);
typedef void (APIENTRY *glSecondaryColorPointerPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glBlendFuncSeparatePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glWindowPos2iPROC) (jint, jint);
typedef void (APIENTRY *glWindowPos2sPROC) (jshort, jshort);
typedef void (APIENTRY *glWindowPos2fPROC) (jfloat, jfloat);
typedef void (APIENTRY *glWindowPos2dPROC) (jdouble, jdouble);
typedef void (APIENTRY *glWindowPos2ivPROC) (intptr_t);
typedef void (APIENTRY *glWindowPos2svPROC) (intptr_t);
typedef void (APIENTRY *glWindowPos2fvPROC) (intptr_t);
typedef void (APIENTRY *glWindowPos2dvPROC) (intptr_t);
typedef void (APIENTRY *glWindowPos3iPROC) (jint, jint, jint);
typedef void (APIENTRY *glWindowPos3sPROC) (jshort, jshort, jshort);
typedef void (APIENTRY *glWindowPos3fPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glWindowPos3dPROC) (jdouble, jdouble, jdouble);
typedef void (APIENTRY *glWindowPos3ivPROC) (intptr_t);
typedef void (APIENTRY *glWindowPos3svPROC) (intptr_t);
typedef void (APIENTRY *glWindowPos3fvPROC) (intptr_t);
typedef void (APIENTRY *glWindowPos3dvPROC) (intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glBlendColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    glBlendColorPROC glBlendColor = (glBlendColorPROC)tlsGetFunction(386);
    UNUSED_PARAM(clazz)
    glBlendColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glBlendEquation(JNIEnv *__env, jclass clazz, jint mode) {
    glBlendEquationPROC glBlendEquation = (glBlendEquationPROC)tlsGetFunction(387);
    UNUSED_PARAM(clazz)
    glBlendEquation(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glFogCoordf(JNIEnv *__env, jclass clazz, jfloat coord) {
    glFogCoordfPROC glFogCoordf = (glFogCoordfPROC)tlsGetFunction(395);
    UNUSED_PARAM(clazz)
    glFogCoordf(coord);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glFogCoordd(JNIEnv *__env, jclass clazz, jdouble coord) {
    glFogCoorddPROC glFogCoordd = (glFogCoorddPROC)tlsGetFunction(396);
    UNUSED_PARAM(clazz)
    glFogCoordd(coord);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglFogCoordfv__J(JNIEnv *__env, jclass clazz, jlong coordAddress) {
    glFogCoordfvPROC glFogCoordfv = (glFogCoordfvPROC)tlsGetFunction(397);
    intptr_t coord = (intptr_t)coordAddress;
    UNUSED_PARAM(clazz)
    glFogCoordfv(coord);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglFogCoorddv__J(JNIEnv *__env, jclass clazz, jlong coordAddress) {
    glFogCoorddvPROC glFogCoorddv = (glFogCoorddvPROC)tlsGetFunction(398);
    intptr_t coord = (intptr_t)coordAddress;
    UNUSED_PARAM(clazz)
    glFogCoorddv(coord);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglFogCoordPointer(JNIEnv *__env, jclass clazz, jint type, jint stride, jlong pointerAddress) {
    glFogCoordPointerPROC glFogCoordPointer = (glFogCoordPointerPROC)tlsGetFunction(399);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glFogCoordPointer(type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglMultiDrawArrays__IJJI(JNIEnv *__env, jclass clazz, jint mode, jlong firstAddress, jlong countAddress, jint primcount) {
    glMultiDrawArraysPROC glMultiDrawArrays = (glMultiDrawArraysPROC)tlsGetFunction(388);
    intptr_t first = (intptr_t)firstAddress;
    intptr_t count = (intptr_t)countAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArrays(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglMultiDrawElements__IJIJI(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint primcount) {
    glMultiDrawElementsPROC glMultiDrawElements = (glMultiDrawElementsPROC)tlsGetFunction(389);
    intptr_t count = (intptr_t)countAddress;
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElements(mode, count, type, indices, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glPointParameterf(JNIEnv *__env, jclass clazz, jint pname, jfloat param) {
    glPointParameterfPROC glPointParameterf = (glPointParameterfPROC)tlsGetFunction(390);
    UNUSED_PARAM(clazz)
    glPointParameterf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glPointParameteri(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glPointParameteriPROC glPointParameteri = (glPointParameteriPROC)tlsGetFunction(391);
    UNUSED_PARAM(clazz)
    glPointParameteri(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglPointParameterfv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glPointParameterfvPROC glPointParameterfv = (glPointParameterfvPROC)tlsGetFunction(392);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glPointParameterfv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglPointParameteriv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glPointParameterivPROC glPointParameteriv = (glPointParameterivPROC)tlsGetFunction(393);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glPointParameteriv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glSecondaryColor3b(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue) {
    glSecondaryColor3bPROC glSecondaryColor3b = (glSecondaryColor3bPROC)tlsGetFunction(400);
    UNUSED_PARAM(clazz)
    glSecondaryColor3b(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glSecondaryColor3s(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue) {
    glSecondaryColor3sPROC glSecondaryColor3s = (glSecondaryColor3sPROC)tlsGetFunction(401);
    UNUSED_PARAM(clazz)
    glSecondaryColor3s(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glSecondaryColor3i(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue) {
    glSecondaryColor3iPROC glSecondaryColor3i = (glSecondaryColor3iPROC)tlsGetFunction(402);
    UNUSED_PARAM(clazz)
    glSecondaryColor3i(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glSecondaryColor3f(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue) {
    glSecondaryColor3fPROC glSecondaryColor3f = (glSecondaryColor3fPROC)tlsGetFunction(403);
    UNUSED_PARAM(clazz)
    glSecondaryColor3f(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glSecondaryColor3d(JNIEnv *__env, jclass clazz, jdouble red, jdouble green, jdouble blue) {
    glSecondaryColor3dPROC glSecondaryColor3d = (glSecondaryColor3dPROC)tlsGetFunction(404);
    UNUSED_PARAM(clazz)
    glSecondaryColor3d(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glSecondaryColor3ub(JNIEnv *__env, jclass clazz, jbyte red, jbyte green, jbyte blue) {
    glSecondaryColor3ubPROC glSecondaryColor3ub = (glSecondaryColor3ubPROC)tlsGetFunction(405);
    UNUSED_PARAM(clazz)
    glSecondaryColor3ub(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glSecondaryColor3us(JNIEnv *__env, jclass clazz, jshort red, jshort green, jshort blue) {
    glSecondaryColor3usPROC glSecondaryColor3us = (glSecondaryColor3usPROC)tlsGetFunction(406);
    UNUSED_PARAM(clazz)
    glSecondaryColor3us(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glSecondaryColor3ui(JNIEnv *__env, jclass clazz, jint red, jint green, jint blue) {
    glSecondaryColor3uiPROC glSecondaryColor3ui = (glSecondaryColor3uiPROC)tlsGetFunction(407);
    UNUSED_PARAM(clazz)
    glSecondaryColor3ui(red, green, blue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3bv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3bvPROC glSecondaryColor3bv = (glSecondaryColor3bvPROC)tlsGetFunction(408);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3bv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3sv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3svPROC glSecondaryColor3sv = (glSecondaryColor3svPROC)tlsGetFunction(409);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3sv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3iv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3ivPROC glSecondaryColor3iv = (glSecondaryColor3ivPROC)tlsGetFunction(410);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3iv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3fv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3fvPROC glSecondaryColor3fv = (glSecondaryColor3fvPROC)tlsGetFunction(411);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3fv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3dv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3dvPROC glSecondaryColor3dv = (glSecondaryColor3dvPROC)tlsGetFunction(412);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3dv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3ubv(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3ubvPROC glSecondaryColor3ubv = (glSecondaryColor3ubvPROC)tlsGetFunction(413);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3ubv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3usv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3usvPROC glSecondaryColor3usv = (glSecondaryColor3usvPROC)tlsGetFunction(414);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3usv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColor3uiv__J(JNIEnv *__env, jclass clazz, jlong vAddress) {
    glSecondaryColor3uivPROC glSecondaryColor3uiv = (glSecondaryColor3uivPROC)tlsGetFunction(415);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColor3uiv(v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglSecondaryColorPointer(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress) {
    glSecondaryColorPointerPROC glSecondaryColorPointer = (glSecondaryColorPointerPROC)tlsGetFunction(416);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColorPointer(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glBlendFuncSeparate(JNIEnv *__env, jclass clazz, jint sfactorRGB, jint dfactorRGB, jint sfactorAlpha, jint dfactorAlpha) {
    glBlendFuncSeparatePROC glBlendFuncSeparate = (glBlendFuncSeparatePROC)tlsGetFunction(394);
    UNUSED_PARAM(clazz)
    glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glWindowPos2i(JNIEnv *__env, jclass clazz, jint x, jint y) {
    glWindowPos2iPROC glWindowPos2i = (glWindowPos2iPROC)tlsGetFunction(417);
    UNUSED_PARAM(clazz)
    glWindowPos2i(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glWindowPos2s(JNIEnv *__env, jclass clazz, jshort x, jshort y) {
    glWindowPos2sPROC glWindowPos2s = (glWindowPos2sPROC)tlsGetFunction(418);
    UNUSED_PARAM(clazz)
    glWindowPos2s(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glWindowPos2f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y) {
    glWindowPos2fPROC glWindowPos2f = (glWindowPos2fPROC)tlsGetFunction(419);
    UNUSED_PARAM(clazz)
    glWindowPos2f(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glWindowPos2d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y) {
    glWindowPos2dPROC glWindowPos2d = (glWindowPos2dPROC)tlsGetFunction(420);
    UNUSED_PARAM(clazz)
    glWindowPos2d(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2iv__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos2ivPROC glWindowPos2iv = (glWindowPos2ivPROC)tlsGetFunction(421);
    intptr_t p = (intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos2iv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2sv__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos2svPROC glWindowPos2sv = (glWindowPos2svPROC)tlsGetFunction(422);
    intptr_t p = (intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos2sv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2fv__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos2fvPROC glWindowPos2fv = (glWindowPos2fvPROC)tlsGetFunction(423);
    intptr_t p = (intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos2fv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos2dv__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos2dvPROC glWindowPos2dv = (glWindowPos2dvPROC)tlsGetFunction(424);
    intptr_t p = (intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos2dv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glWindowPos3i(JNIEnv *__env, jclass clazz, jint x, jint y, jint z) {
    glWindowPos3iPROC glWindowPos3i = (glWindowPos3iPROC)tlsGetFunction(425);
    UNUSED_PARAM(clazz)
    glWindowPos3i(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glWindowPos3s(JNIEnv *__env, jclass clazz, jshort x, jshort y, jshort z) {
    glWindowPos3sPROC glWindowPos3s = (glWindowPos3sPROC)tlsGetFunction(426);
    UNUSED_PARAM(clazz)
    glWindowPos3s(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glWindowPos3f(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z) {
    glWindowPos3fPROC glWindowPos3f = (glWindowPos3fPROC)tlsGetFunction(427);
    UNUSED_PARAM(clazz)
    glWindowPos3f(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_glWindowPos3d(JNIEnv *__env, jclass clazz, jdouble x, jdouble y, jdouble z) {
    glWindowPos3dPROC glWindowPos3d = (glWindowPos3dPROC)tlsGetFunction(428);
    UNUSED_PARAM(clazz)
    glWindowPos3d(x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3iv__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos3ivPROC glWindowPos3iv = (glWindowPos3ivPROC)tlsGetFunction(429);
    intptr_t p = (intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos3iv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3sv__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos3svPROC glWindowPos3sv = (glWindowPos3svPROC)tlsGetFunction(430);
    intptr_t p = (intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos3sv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3fv__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos3fvPROC glWindowPos3fv = (glWindowPos3fvPROC)tlsGetFunction(431);
    intptr_t p = (intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos3fv(p);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14_nglWindowPos3dv__J(JNIEnv *__env, jclass clazz, jlong pAddress) {
    glWindowPos3dvPROC glWindowPos3dv = (glWindowPos3dvPROC)tlsGetFunction(432);
    intptr_t p = (intptr_t)pAddress;
    UNUSED_PARAM(clazz)
    glWindowPos3dv(p);
}

EXTERN_C_EXIT
