/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The OpenGL functionality of a forward compatible context, up to version 3.0.
 * 
 * <p>OpenGL 3.0 implementations are guaranteed to support at least versions 1.10, 1.20 and 1.30 of the shading language,
 * although versions 1.10 and 1.20 are deprecated in a forward-compatible context.</p>
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_gpu_shader4.txt">EXT_gpu_shader4</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_conditional_render.txt">NV_conditional_render</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_flush_buffer_range.txt">APPLE_flush_buffer_range</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_color_buffer_float.txt">ARB_color_buffer_float</a>, <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_depth_buffer_float.txt">NV_depth_buffer_float</a>, <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_float.txt">ARB_texture_float</a>,
 * <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_packed_float.txt">EXT_packed_float</a> and <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_shared_exponent.txt">EXT_texture_shared_exponent</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_object.txt">EXT_framebuffer_object</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_half_float.txt">NV_half_float</a> and <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_half_FLOAT_pixel.txt">ARB_half_FLOAT_pixel</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_multisample.txt">EXT_framebuffer_multisample</a> and <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_blit.txt">EXT_framebuffer_blit</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_integer.txt">EXT_texture_integer</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_array.txt">EXT_texture_array</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_packed_depth_stencil.txt">EXT_packed_depth_stencil</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_draw_buffers2.txt">EXT_draw_buffers2</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_compression_rgtc.txt">EXT_texture_compression_rgtc</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_transform_feedback.txt">EXT_transform_feedback</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_vertex_array_object.txt">APPLE_vertex_array_object</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_sRGB.txt">EXT_framebuffer_sRGB</a></li>
 * </ul>
 */
public class GL30C extends GL21C {

    static { GL.initialize(); }

    /** GetTarget */
    public static final int
        GL_MAJOR_VERSION                       = 0x821B,
        GL_MINOR_VERSION                       = 0x821C,
        GL_NUM_EXTENSIONS                      = 0x821D,
        GL_CONTEXT_FLAGS                       = 0x821E,
        GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x1;

    /** Renamed tokens. */
    public static final int
        GL_COMPARE_REF_TO_TEXTURE = 0x884E,
        GL_CLIP_DISTANCE0         = 0x3000,
        GL_CLIP_DISTANCE1         = 0x3001,
        GL_CLIP_DISTANCE2         = 0x3002,
        GL_CLIP_DISTANCE3         = 0x3003,
        GL_CLIP_DISTANCE4         = 0x3004,
        GL_CLIP_DISTANCE5         = 0x3005,
        GL_CLIP_DISTANCE6         = 0x3006,
        GL_CLIP_DISTANCE7         = 0x3007,
        GL_MAX_CLIP_DISTANCES     = 0xD32,
        GL_MAX_VARYING_COMPONENTS = 0x8B4B;

    /** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, GetVertexAttribiv, GetVertexAttribIuiv and GetVertexAttribIiv. */
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int
        GL_SAMPLER_1D_ARRAY              = 0x8DC0,
        GL_SAMPLER_2D_ARRAY              = 0x8DC1,
        GL_SAMPLER_1D_ARRAY_SHADOW       = 0x8DC3,
        GL_SAMPLER_2D_ARRAY_SHADOW       = 0x8DC4,
        GL_SAMPLER_CUBE_SHADOW           = 0x8DC5,
        GL_UNSIGNED_INT_VEC2             = 0x8DC6,
        GL_UNSIGNED_INT_VEC3             = 0x8DC7,
        GL_UNSIGNED_INT_VEC4             = 0x8DC8,
        GL_INT_SAMPLER_1D                = 0x8DC9,
        GL_INT_SAMPLER_2D                = 0x8DCA,
        GL_INT_SAMPLER_3D                = 0x8DCB,
        GL_INT_SAMPLER_CUBE              = 0x8DCC,
        GL_INT_SAMPLER_1D_ARRAY          = 0x8DCE,
        GL_INT_SAMPLER_2D_ARRAY          = 0x8DCF,
        GL_UNSIGNED_INT_SAMPLER_1D       = 0x8DD1,
        GL_UNSIGNED_INT_SAMPLER_2D       = 0x8DD2,
        GL_UNSIGNED_INT_SAMPLER_3D       = 0x8DD3,
        GL_UNSIGNED_INT_SAMPLER_CUBE     = 0x8DD4,
        GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6,
        GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904,
        GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;

    /** Accepted by the {@code mode} parameter of BeginConditionalRender. */
    public static final int
        GL_QUERY_WAIT              = 0x8E13,
        GL_QUERY_NO_WAIT           = 0x8E14,
        GL_QUERY_BY_REGION_WAIT    = 0x8E15,
        GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;

    /** Accepted by the {@code access} parameter of MapBufferRange. */
    public static final int
        GL_MAP_READ_BIT              = 0x1,
        GL_MAP_WRITE_BIT             = 0x2,
        GL_MAP_INVALIDATE_RANGE_BIT  = 0x4,
        GL_MAP_INVALIDATE_BUFFER_BIT = 0x8,
        GL_MAP_FLUSH_EXPLICIT_BIT    = 0x10,
        GL_MAP_UNSYNCHRONIZED_BIT    = 0x20;

    /** Accepted by the {@code pname} parameter of GetBufferParameteriv. */
    public static final int
        GL_BUFFER_ACCESS_FLAGS = 0x911F,
        GL_BUFFER_MAP_LENGTH   = 0x9120,
        GL_BUFFER_MAP_OFFSET   = 0x9121;

    /** Accepted by the {@code target} parameter of ClampColor and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_CLAMP_READ_COLOR = 0x891C;

    /** Accepted by the {@code clamp} parameter of ClampColor. */
    public static final int GL_FIXED_ONLY = 0x891D;

    /**
     * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
     * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
     */
    public static final int
        GL_DEPTH_COMPONENT32F = 0x8CAC,
        GL_DEPTH32F_STENCIL8  = 0x8CAD;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage.
     */
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter. */
    public static final int
        GL_TEXTURE_RED_TYPE   = 0x8C10,
        GL_TEXTURE_GREEN_TYPE = 0x8C11,
        GL_TEXTURE_BLUE_TYPE  = 0x8C12,
        GL_TEXTURE_ALPHA_TYPE = 0x8C13,
        GL_TEXTURE_DEPTH_TYPE = 0x8C16;

    /** Returned by the {@code params} parameter of GetTexLevelParameter. */
    public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
    public static final int
        GL_RGBA32F = 0x8814,
        GL_RGB32F  = 0x8815,
        GL_RGBA16F = 0x881A,
        GL_RGB16F  = 0x881B;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage. */
    public static final int GL_R11F_G11F_B10F = 0x8C3A;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
     * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
     * GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
     */
    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage. */
    public static final int GL_RGB9_E5 = 0x8C3D;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
     * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
     * GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
     */
    public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv. */
    public static final int GL_TEXTURE_SHARED_SIZE = 0x8C3F;

    /**
     * Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and
     * GetFramebufferAttachmentParameteriv.
     */
    public static final int
        GL_FRAMEBUFFER      = 0x8D40,
        GL_READ_FRAMEBUFFER = 0x8CA8,
        GL_DRAW_FRAMEBUFFER = 0x8CA9;

    /**
     * Accepted by the {@code target} parameter of BindRenderbuffer, RenderbufferStorage, and GetRenderbufferParameteriv, and returned by
     * GetFramebufferAttachmentParameteriv.
     */
    public static final int GL_RENDERBUFFER = 0x8D41;

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage. */
    public static final int
        GL_STENCIL_INDEX1  = 0x8D46,
        GL_STENCIL_INDEX4  = 0x8D47,
        GL_STENCIL_INDEX8  = 0x8D48,
        GL_STENCIL_INDEX16 = 0x8D49;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
    public static final int
        GL_RENDERBUFFER_WIDTH           = 0x8D42,
        GL_RENDERBUFFER_HEIGHT          = 0x8D43,
        GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44,
        GL_RENDERBUFFER_RED_SIZE        = 0x8D50,
        GL_RENDERBUFFER_GREEN_SIZE      = 0x8D51,
        GL_RENDERBUFFER_BLUE_SIZE       = 0x8D52,
        GL_RENDERBUFFER_ALPHA_SIZE      = 0x8D53,
        GL_RENDERBUFFER_DEPTH_SIZE      = 0x8D54,
        GL_RENDERBUFFER_STENCIL_SIZE    = 0x8D55,
        GL_RENDERBUFFER_SAMPLES         = 0x8CAB;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE           = 0x8CD0,
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME           = 0x8CD1,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL         = 0x8CD2,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER         = 0x8CD4,
        GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING        = 0x8210,
        GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE        = 0x8211,
        GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE              = 0x8212,
        GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE            = 0x8213,
        GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE             = 0x8214,
        GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE            = 0x8215,
        GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE            = 0x8216,
        GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE          = 0x8217;

    /** Returned in {@code params} by GetFramebufferAttachmentParameteriv. */
    public static final int GL_FRAMEBUFFER_DEFAULT = 0x8218;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv. */
    public static final int
        GL_COLOR_ATTACHMENT0        = 0x8CE0,
        GL_COLOR_ATTACHMENT1        = 0x8CE1,
        GL_COLOR_ATTACHMENT2        = 0x8CE2,
        GL_COLOR_ATTACHMENT3        = 0x8CE3,
        GL_COLOR_ATTACHMENT4        = 0x8CE4,
        GL_COLOR_ATTACHMENT5        = 0x8CE5,
        GL_COLOR_ATTACHMENT6        = 0x8CE6,
        GL_COLOR_ATTACHMENT7        = 0x8CE7,
        GL_COLOR_ATTACHMENT8        = 0x8CE8,
        GL_COLOR_ATTACHMENT9        = 0x8CE9,
        GL_COLOR_ATTACHMENT10       = 0x8CEA,
        GL_COLOR_ATTACHMENT11       = 0x8CEB,
        GL_COLOR_ATTACHMENT12       = 0x8CEC,
        GL_COLOR_ATTACHMENT13       = 0x8CED,
        GL_COLOR_ATTACHMENT14       = 0x8CEE,
        GL_COLOR_ATTACHMENT15       = 0x8CEF,
        GL_COLOR_ATTACHMENT16       = 0x8CF0,
        GL_COLOR_ATTACHMENT17       = 0x8CF1,
        GL_COLOR_ATTACHMENT18       = 0x8CF2,
        GL_COLOR_ATTACHMENT19       = 0x8CF3,
        GL_COLOR_ATTACHMENT20       = 0x8CF4,
        GL_COLOR_ATTACHMENT21       = 0x8CF5,
        GL_COLOR_ATTACHMENT22       = 0x8CF6,
        GL_COLOR_ATTACHMENT23       = 0x8CF7,
        GL_COLOR_ATTACHMENT24       = 0x8CF8,
        GL_COLOR_ATTACHMENT25       = 0x8CF9,
        GL_COLOR_ATTACHMENT26       = 0x8CFA,
        GL_COLOR_ATTACHMENT27       = 0x8CFB,
        GL_COLOR_ATTACHMENT28       = 0x8CFC,
        GL_COLOR_ATTACHMENT29       = 0x8CFD,
        GL_COLOR_ATTACHMENT30       = 0x8CFE,
        GL_COLOR_ATTACHMENT31       = 0x8CFF,
        GL_DEPTH_ATTACHMENT         = 0x8D00,
        GL_STENCIL_ATTACHMENT       = 0x8D20,
        GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_MAX_SAMPLES = 0x8D57;

    /** Returned by CheckFramebufferStatus(). */
    public static final int
        GL_FRAMEBUFFER_COMPLETE                      = 0x8CD5,
        GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT         = 0x8CD6,
        GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7,
        GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER        = 0x8CDB,
        GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER        = 0x8CDC,
        GL_FRAMEBUFFER_UNSUPPORTED                   = 0x8CDD,
        GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE        = 0x8D56,
        GL_FRAMEBUFFER_UNDEFINED                     = 0x8219;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev. */
    public static final int
        GL_FRAMEBUFFER_BINDING      = 0x8CA6,
        GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6,
        GL_READ_FRAMEBUFFER_BINDING = 0x8CAA,
        GL_RENDERBUFFER_BINDING     = 0x8CA7,
        GL_MAX_COLOR_ATTACHMENTS    = 0x8CDF,
        GL_MAX_RENDERBUFFER_SIZE    = 0x84E8;

    /** Returned by GetError(). */
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x506;

    /**
     * Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D,
     * CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
     */
    public static final int GL_DEPTH_STENCIL = 0x84F9;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage.
     */
    public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;

    /**
     * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
     * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
     */
    public static final int GL_DEPTH24_STENCIL8 = 0x88F0;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter. */
    public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, GetTexImage, TexSubImage1D, TexSubImage2D,
     * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter,
     * ColorTable, ColorSubTable, and GetColorTable.
     * 
     * <p>Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, FogCoordPointer, TexCoordPointer, and
     * VertexAttribPointer.</p>
     */
    public static final int GL_HALF_FLOAT = 0x140B;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
    public static final int
        GL_RGBA32UI = 0x8D70,
        GL_RGB32UI  = 0x8D71,
        GL_RGBA16UI = 0x8D76,
        GL_RGB16UI  = 0x8D77,
        GL_RGBA8UI  = 0x8D7C,
        GL_RGB8UI   = 0x8D7D,
        GL_RGBA32I  = 0x8D82,
        GL_RGB32I   = 0x8D83,
        GL_RGBA16I  = 0x8D88,
        GL_RGB16I   = 0x8D89,
        GL_RGBA8I   = 0x8D8E,
        GL_RGB8I    = 0x8D8F;

    /** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels. */
    public static final int
        GL_RED_INTEGER   = 0x8D94,
        GL_GREEN_INTEGER = 0x8D95,
        GL_BLUE_INTEGER  = 0x8D96,
        GL_RGB_INTEGER   = 0x8D98,
        GL_RGBA_INTEGER  = 0x8D99,
        GL_BGR_INTEGER   = 0x8D9A,
        GL_BGRA_INTEGER  = 0x8D9B;

    /** Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture. */
    public static final int
        GL_TEXTURE_1D_ARRAY = 0x8C18,
        GL_TEXTURE_2D_ARRAY = 0x8C1A;

    /** Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CopyTexSubImage3D, CompressedTexImage3D, and CompressedTexSubImage3D. */
    public static final int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;

    /**
     * Accepted by the {@code target} parameter of TexImage2D, TexSubImage2D, CopyTexImage2D, CopyTexSubImage2D, CompressedTexImage2D, and
     * CompressedTexSubImage2D.
     */
    public static final int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
    public static final int
        GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C,
        GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D,
        GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;

    /**
     * Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
     * CompressedTexSubImage2D.
     */
    public static final int
        GL_COMPRESSED_RED_RGTC1        = 0x8DBB,
        GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC,
        GL_COMPRESSED_RG_RGTC2         = 0x8DBD,
        GL_COMPRESSED_SIGNED_RG_RGTC2  = 0x8DBE;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D. */
    public static final int
        GL_R8             = 0x8229,
        GL_R16            = 0x822A,
        GL_RG8            = 0x822B,
        GL_RG16           = 0x822C,
        GL_R16F           = 0x822D,
        GL_R32F           = 0x822E,
        GL_RG16F          = 0x822F,
        GL_RG32F          = 0x8230,
        GL_R8I            = 0x8231,
        GL_R8UI           = 0x8232,
        GL_R16I           = 0x8233,
        GL_R16UI          = 0x8234,
        GL_R32I           = 0x8235,
        GL_R32UI          = 0x8236,
        GL_RG8I           = 0x8237,
        GL_RG8UI          = 0x8238,
        GL_RG16I          = 0x8239,
        GL_RG16UI         = 0x823A,
        GL_RG32I          = 0x823B,
        GL_RG32UI         = 0x823C,
        GL_RG             = 0x8227,
        GL_COMPRESSED_RED = 0x8225,
        GL_COMPRESSED_RG  = 0x8226;

    /** Accepted by the {@code format} parameter of TexImage3D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and ReadPixels. */
    public static final int GL_RG_INTEGER = 0x8228;

    /**
     * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
     * BindBufferRange, BindBufferOffset and BindBufferBase.
     */
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;

    /** Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v. */
    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84,
        GL_TRANSFORM_FEEDBACK_BUFFER_SIZE  = 0x8C85;

    /**
     * Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v, and by the {@code pname} parameter of GetBooleanv,
     * GetDoublev, GetIntegerv, and GetFloatv.
     */
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;

    /** Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryings. */
    public static final int
        GL_INTERLEAVED_ATTRIBS = 0x8C8C,
        GL_SEPARATE_ATTRIBS    = 0x8C8D;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
    public static final int
        GL_PRIMITIVES_GENERATED                  = 0x8C87,
        GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int GL_RASTERIZER_DISCARD = 0x8C89;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int
        GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS       = 0x8C8B,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS    = 0x8C80;

    /** Accepted by the {@code pname} parameter of GetProgramiv. */
    public static final int
        GL_TRANSFORM_FEEDBACK_VARYINGS           = 0x8C83,
        GL_TRANSFORM_FEEDBACK_BUFFER_MODE        = 0x8C7F,
        GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int GL_FRAMEBUFFER_SRGB = 0x8DB9;

    protected GL30C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetStringi ] ---

    /** Unsafe version of: {@link #glGetStringi GetStringi} */
    public static native long nglGetStringi(int name, int index);

    /**
     * Queries indexed string state.
     *
     * @param name  the indexed state to query. One of:<br><table><tr><td>{@link GL11#GL_EXTENSIONS EXTENSIONS}</td><td>{@link GL20#GL_SHADING_LANGUAGE_VERSION SHADING_LANGUAGE_VERSION}</td></tr></table>
     * @param index the index of the particular element being queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetStringi">Reference Page</a>
     */
    @Nullable
    @NativeType("GLubyte const *")
    public static String glGetStringi(@NativeType("GLenum") int name, @NativeType("GLuint") int index) {
        long __result = nglGetStringi(name, index);
        return memUTF8Safe(__result);
    }

    // --- [ glClearBufferiv ] ---

    /** Unsafe version of: {@link #glClearBufferiv ClearBufferiv} */
    public static native void nglClearBufferiv(int buffer, int drawbuffer, long value);

    /**
     * Clears an individual buffer of the currently bound framebuffer object to the {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
     *
     * @param buffer     the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_STENCIL STENCIL}</td></tr></table>
     * @param drawbuffer the draw buffer to clear
     * @param value      for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For stencil buffers, a pointer to a
     *                   single stencil value to clear the buffer to.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglClearBufferiv(buffer, drawbuffer, memAddress(value));
    }

    // --- [ glClearBufferuiv ] ---

    /** Unsafe version of: {@link #glClearBufferuiv ClearBufferuiv} */
    public static native void nglClearBufferuiv(int buffer, int drawbuffer, long value);

    /**
     * Clears an individual buffer of the currently bound framebuffer object to the {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
     *
     * @param buffer     the buffer to clear. Must be:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td></tr></table>
     * @param drawbuffer the draw buffer to clear
     * @param value      a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 4);
        }
        nglClearBufferuiv(buffer, drawbuffer, memAddress(value));
    }

    // --- [ glClearBufferfv ] ---

    /** Unsafe version of: {@link #glClearBufferfv ClearBufferfv} */
    public static native void nglClearBufferfv(int buffer, int drawbuffer, long value);

    /**
     * Clears an individual buffer of the currently bound framebuffer object to the {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
     *
     * @param buffer     the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_DEPTH DEPTH}</td></tr></table>
     * @param drawbuffer the draw buffer to clear
     * @param value      for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For depth buffers, a pointer to a
     *                   single depth value to clear the buffer to.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglClearBufferfv(buffer, drawbuffer, memAddress(value));
    }

    // --- [ glClearBufferfi ] ---

    /**
     * Clears an individual buffer of the currently bound framebuffer object to the {@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
     *
     * @param buffer     the buffer to clear. Must be:<br><table><tr><td>{@link #GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param drawbuffer the draw buffer to clear
     * @param depth      the depth value to clear the buffer to
     * @param stencil    the stencil value to clear the buffer to
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBufferfi">Reference Page</a>
     */
    public static native void glClearBufferfi(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil);

    // --- [ glVertexAttribI1i ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribI1i(@NativeType("GLuint") int index, @NativeType("GLint") int x);

    // --- [ glVertexAttribI2i ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribI2i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y);

    // --- [ glVertexAttribI3i ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute. The w component is implicitly set to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribI3i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glVertexAttribI4i ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * @param w     the vertex attribute w component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribI4i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glVertexAttribI1ui ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribI1ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x);

    // --- [ glVertexAttribI2ui ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribI2ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y);

    // --- [ glVertexAttribI3ui ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute. The w component is implicitly set to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribI3ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glVertexAttribI4ui ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * @param w     the vertex attribute w component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribI4ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glVertexAttribI1iv ] ---

    /** Unsafe version of: {@link #glVertexAttribI1iv VertexAttribI1iv} */
    public static native void nglVertexAttribI1iv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI1i VertexAttribI1i}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI1iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribI1iv(index, memAddress(v));
    }

    // --- [ glVertexAttribI2iv ] ---

    /** Unsafe version of: {@link #glVertexAttribI2iv VertexAttribI2iv} */
    public static native void nglVertexAttribI2iv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI2i VertexAttribI2i}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI2iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribI2iv(index, memAddress(v));
    }

    // --- [ glVertexAttribI3iv ] ---

    /** Unsafe version of: {@link #glVertexAttribI3iv VertexAttribI3iv} */
    public static native void nglVertexAttribI3iv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI3i VertexAttribI3i}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI3iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribI3iv(index, memAddress(v));
    }

    // --- [ glVertexAttribI4iv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4iv VertexAttribI4iv} */
    public static native void nglVertexAttribI4iv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI4i VertexAttribI4i}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4iv(index, memAddress(v));
    }

    // --- [ glVertexAttribI1uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribI1uiv VertexAttribI1uiv} */
    public static native void nglVertexAttribI1uiv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI1ui VertexAttribI1ui}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI1uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribI1uiv(index, memAddress(v));
    }

    // --- [ glVertexAttribI2uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribI2uiv VertexAttribI2uiv} */
    public static native void nglVertexAttribI2uiv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI2ui VertexAttribI2ui}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI2uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribI2uiv(index, memAddress(v));
    }

    // --- [ glVertexAttribI3uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribI3uiv VertexAttribI3uiv} */
    public static native void nglVertexAttribI3uiv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI3ui VertexAttribI3ui}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI3uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribI3uiv(index, memAddress(v));
    }

    // --- [ glVertexAttribI4uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4uiv VertexAttribI4uiv} */
    public static native void nglVertexAttribI4uiv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttribI4ui VertexAttribI4ui}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4uiv(index, memAddress(v));
    }

    // --- [ glVertexAttribI4bv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4bv VertexAttribI4bv} */
    public static native void nglVertexAttribI4bv(int index, long v);

    /**
     * Byte version of {@link #glVertexAttribI4iv VertexAttribI4iv}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4bv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4bv(index, memAddress(v));
    }

    // --- [ glVertexAttribI4sv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4sv VertexAttribI4sv} */
    public static native void nglVertexAttribI4sv(int index, long v);

    /**
     * Short version of {@link #glVertexAttribI4iv VertexAttribI4iv}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4sv(index, memAddress(v));
    }

    // --- [ glVertexAttribI4ubv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4ubv VertexAttribI4ubv} */
    public static native void nglVertexAttribI4ubv(int index, long v);

    /**
     * Byte version of {@link #glVertexAttribI4uiv VertexAttribI4uiv}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4ubv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4ubv(index, memAddress(v));
    }

    // --- [ glVertexAttribI4usv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4usv VertexAttribI4usv} */
    public static native void nglVertexAttribI4usv(int index, long v);

    /**
     * Short version of {@link #glVertexAttribI4uiv VertexAttribI4uiv}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4usv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4usv(index, memAddress(v));
    }

    // --- [ glVertexAttribIPointer ] ---

    /** Unsafe version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
    public static native void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer);

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>
     */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>
     */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribIPointer(index, size, type, stride, pointer);
    }

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>
     */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>
     */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
    }

    // --- [ glGetVertexAttribIiv ] ---

    /** Unsafe version of: {@link #glGetVertexAttribIiv GetVertexAttribIiv} */
    public static native void nglGetVertexAttribIiv(int index, int pname, long params);

    /**
     * Returns the value of a pure integer generic vertex attribute parameter.
     *
     * @param index  the index of the pure integer generic vertex attribute to be modified
     * @param pname  the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>
     * @param params returns the requested data
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribIiv(index, pname, memAddress(params));
    }

    /**
     * Returns the value of a pure integer generic vertex attribute parameter.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param pname the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetVertexAttribIi(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribIiv(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribIuiv ] ---

    /** Unsafe version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv} */
    public static native void nglGetVertexAttribIuiv(int index, int pname, long params);

    /**
     * Unsigned version of {@link #glGetVertexAttribIiv GetVertexAttribIiv}.
     *
     * @param index  the index of the pure integer generic vertex attribute to be modified
     * @param pname  the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>
     * @param params returns the requested data
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribIuiv(index, pname, memAddress(params));
    }

    /**
     * Unsigned version of {@link #glGetVertexAttribIiv GetVertexAttribIiv}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param pname the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetVertexAttribIui(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribIuiv(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glUniform1ui ] ---

    /**
     * Specifies the value of a uint uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform1ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0);

    // --- [ glUniform2ui ] ---

    /**
     * Specifies the value of a uvec2 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform2ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1);

    // --- [ glUniform3ui ] ---

    /**
     * Specifies the value of a uvec3 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform3ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2);

    // --- [ glUniform4ui ] ---

    /**
     * Specifies the value of a uvec4 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     * @param v3       the uniform w value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform4ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3);

    // --- [ glUniform1uiv ] ---

    /**
     * Unsafe version of: {@link #glUniform1uiv Uniform1uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform1uiv(int location, int count, long value);

    /**
     * Specifies the value of a single uint uniform variable or a uint uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform1uiv(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2uiv ] ---

    /**
     * Unsafe version of: {@link #glUniform2uiv Uniform2uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform2uiv(int location, int count, long value);

    /**
     * Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform2uiv(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3uiv ] ---

    /**
     * Unsafe version of: {@link #glUniform3uiv Uniform3uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform3uiv(int location, int count, long value);

    /**
     * Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform3uiv(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4uiv ] ---

    /**
     * Unsafe version of: {@link #glUniform4uiv Uniform4uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform4uiv(int location, int count, long value);

    /**
     * Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform4uiv(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glGetUniformuiv ] ---

    /** Unsafe version of: {@link #glGetUniformuiv GetUniformuiv} */
    public static native void nglGetUniformuiv(int program, int location, long params);

    /**
     * Returns the uint value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformuiv(program, location, memAddress(params));
    }

    /**
     * Returns the uint value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformuiv(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBindFragDataLocation ] ---

    /** Unsafe version of: {@link #glBindFragDataLocation BindFragDataLocation} */
    public static native void nglBindFragDataLocation(int program, int colorNumber, long name);

    /**
     * Binds a user-defined varying out variable to a fragment shader color number.
     *
     * @param program     the name of the program containing varying out variable whose binding to modify
     * @param colorNumber the color number to bind the user-defined varying out variable to
     * @param name        the name of the user-defined varying out variable whose binding to modify
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindFragDataLocation">Reference Page</a>
     */
    public static void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindFragDataLocation(program, colorNumber, memAddress(name));
    }

    /**
     * Binds a user-defined varying out variable to a fragment shader color number.
     *
     * @param program     the name of the program containing varying out variable whose binding to modify
     * @param colorNumber the color number to bind the user-defined varying out variable to
     * @param name        the name of the user-defined varying out variable whose binding to modify
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindFragDataLocation">Reference Page</a>
     */
    public static void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindFragDataLocation(program, colorNumber, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFragDataLocation ] ---

    /** Unsafe version of: {@link #glGetFragDataLocation GetFragDataLocation} */
    public static native int nglGetFragDataLocation(int program, long name);

    /**
     * Queries the bindings of color numbers to user-defined varying out variables.
     *
     * @param program the name of the program containing varying out variable whose binding to query
     * @param name    the name of the user-defined varying out variable whose binding to query
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetFragDataLocation">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetFragDataLocation(program, memAddress(name));
    }

    /**
     * Queries the bindings of color numbers to user-defined varying out variables.
     *
     * @param program the name of the program containing varying out variable whose binding to query
     * @param name    the name of the user-defined varying out variable whose binding to query
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetFragDataLocation">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetFragDataLocation(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBeginConditionalRender ] ---

    /**
     * Starts conditional rendering.
     *
     * @param id   the name of an occlusion query object whose results are used to determine if the rendering commands are discarded
     * @param mode how {@code glBeginConditionalRender} interprets the results of the occlusion query. One of:<br><table><tr><td>{@link #GL_QUERY_WAIT QUERY_WAIT}</td><td>{@link #GL_QUERY_NO_WAIT QUERY_NO_WAIT}</td><td>{@link #GL_QUERY_BY_REGION_WAIT QUERY_BY_REGION_WAIT}</td></tr><tr><td>{@link #GL_QUERY_BY_REGION_NO_WAIT QUERY_BY_REGION_NO_WAIT}</td><td>{@link GL45#GL_QUERY_WAIT_INVERTED QUERY_WAIT_INVERTED}</td><td>{@link GL45#GL_QUERY_NO_WAIT_INVERTED QUERY_NO_WAIT_INVERTED}</td></tr><tr><td>{@link GL45#GL_QUERY_BY_REGION_WAIT_INVERTED QUERY_BY_REGION_WAIT_INVERTED}</td><td>{@link GL45#GL_QUERY_BY_REGION_NO_WAIT_INVERTED QUERY_BY_REGION_NO_WAIT_INVERTED}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBeginConditionalRender">Reference Page</a>
     */
    public static native void glBeginConditionalRender(@NativeType("GLuint") int id, @NativeType("GLenum") int mode);

    // --- [ glEndConditionalRender ] ---

    /**
     * Ends conditional rendering.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glEndConditionalRender">Reference Page</a>
     */
    public static native void glEndConditionalRender();

    // --- [ glMapBufferRange ] ---

    /** Unsafe version of: {@link #glMapBufferRange MapBufferRange} */
    public static native long nglMapBufferRange(int target, long offset, long length, int access);

    /**
     * Maps a section of a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 2 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBufferRange(int, long, long, int)} - Always returns a new ByteBuffer instance.</li>
     * <li>{@link #glMapBufferRange(int, long, long, int, ByteBuffer)} - The {@code old_buffer} parameter is reused if not null.</li>
     * </ol>
     *
     * @param target a binding to which the target buffer is bound. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the starting offset within the buffer of the range to be mapped
     * @param length the length of the range to be mapped
     * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link #GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link #GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link #GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link #GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link #GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link #GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glMapBufferRange">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        long __result = nglMapBufferRange(target, offset, length, access);
        return memByteBufferSafe(__result, (int)length);
    }

    /**
     * Maps a section of a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 2 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBufferRange(int, long, long, int)} - Always returns a new ByteBuffer instance.</li>
     * <li>{@link #glMapBufferRange(int, long, long, int, ByteBuffer)} - The {@code old_buffer} parameter is reused if not null.</li>
     * </ol>
     *
     * @param target a binding to which the target buffer is bound. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the starting offset within the buffer of the range to be mapped
     * @param length the length of the range to be mapped
     * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link #GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link #GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link #GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link #GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link #GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link #GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glMapBufferRange">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferRange(target, offset, length, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glFlushMappedBufferRange ] ---

    /**
     * Indicates modifications to a range of a mapped buffer.
     *
     * @param target the target of the flush operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link #GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the start of the buffer subrange, in basic machine units
     * @param length the length of the buffer subrange, in basic machine units
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFlushMappedBufferRange">Reference Page</a>
     */
    public static native void glFlushMappedBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length);

    // --- [ glClampColor ] ---

    /**
     * Controls color clamping.
     *
     * @param target target for color clamping. Must be:<br><table><tr><td>{@link #GL_CLAMP_READ_COLOR CLAMP_READ_COLOR}</td></tr></table>
     * @param clamp  whether to apply color clamping. One of:<br><table><tr><td>{@link GL11#GL_TRUE TRUE}</td><td>{@link GL11#GL_FALSE FALSE}</td><td>{@link #GL_FIXED_ONLY FIXED_ONLY}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClampColor">Reference Page</a>
     */
    public static native void glClampColor(@NativeType("GLenum") int target, @NativeType("GLenum") int clamp);

    // --- [ glIsRenderbuffer ] ---

    /**
     * Determines if a name corresponds to a renderbuffer object.
     *
     * @param renderbuffer a value that may be the name of a renderbuffer object
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsRenderbuffer">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static native boolean glIsRenderbuffer(@NativeType("GLuint") int renderbuffer);

    // --- [ glBindRenderbuffer ] ---

    /**
     * Binds a renderbuffer to a renderbuffer target.
     *
     * @param target       the renderbuffer target of the binding operation. Must be:<br><table><tr><td>{@link #GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param renderbuffer the name of the renderbuffer object to bind
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindRenderbuffer">Reference Page</a>
     */
    public static native void glBindRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer);

    // --- [ glDeleteRenderbuffers ] ---

    /**
     * Unsafe version of: {@link #glDeleteRenderbuffers DeleteRenderbuffers}
     *
     * @param n the number of renderbuffer objects to be deleted
     */
    public static native void nglDeleteRenderbuffers(int n, long renderbuffers);

    /**
     * Deletes renderbuffer objects.
     *
     * @param renderbuffers an array containing {@code n} renderbuffer objects to be deleted
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteRenderbuffers">Reference Page</a>
     */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") IntBuffer renderbuffers) {
        nglDeleteRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
    }

    /**
     * Deletes renderbuffer objects.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteRenderbuffers">Reference Page</a>
     */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int renderbuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer renderbuffers = stack.ints(renderbuffer);
            nglDeleteRenderbuffers(1, memAddress(renderbuffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenRenderbuffers ] ---

    /**
     * Unsafe version of: {@link #glGenRenderbuffers GenRenderbuffers}
     *
     * @param n the number of renderbuffer object names to generate
     */
    public static native void nglGenRenderbuffers(int n, long renderbuffers);

    /**
     * Generates renderbuffer object names.
     *
     * @param renderbuffers a buffer in which the generated renderbuffer object names are stored
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenRenderbuffers">Reference Page</a>
     */
    public static void glGenRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        nglGenRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
    }

    /**
     * Generates renderbuffer object names.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenRenderbuffers">Reference Page</a>
     */
    @NativeType("void")
    public static int glGenRenderbuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer renderbuffers = stack.callocInt(1);
            nglGenRenderbuffers(1, memAddress(renderbuffers));
            return renderbuffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glRenderbufferStorage ] ---

    /**
     * Establishes data storage, format and dimensions of a renderbuffer object's image.
     *
     * @param target         the target of the allocation. Must be:<br><table><tr><td>{@link #GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
     * @param width          the width of the renderbuffer, in pixels
     * @param height         the height of the renderbuffer, in pixels
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glRenderbufferStorage">Reference Page</a>
     */
    public static native void glRenderbufferStorage(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glRenderbufferStorageMultisample ] ---

    /**
     * Establishes data storage, format, dimensions and sample count of a renderbuffer object's image.
     * 
     * <p>{@link #glRenderbufferStorage RenderbufferStorage} is equivalent to calling this method with the samples set to zero.</p>
     *
     * @param target         the target of the allocation. Must be:<br><table><tr><td>{@link #GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param samples        the number of samples to be used for the renderbuffer object's storage
     * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
     * @param width          the width of the renderbuffer, in pixels
     * @param height         the height of the renderbuffer, in pixels
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glRenderbufferStorageMultisample">Reference Page</a>
     */
    public static native void glRenderbufferStorageMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetRenderbufferParameteriv ] ---

    /** Unsafe version of: {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv} */
    public static native void nglGetRenderbufferParameteriv(int target, int pname, long params);

    /**
     * Retrieves information about a bound renderbuffer object.
     *
     * @param target the target of the query operation. Must be:<br><table><tr><td>{@link #GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param pname  the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link #GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link #GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link #GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link #GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link #GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link #GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link #GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link #GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link #GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link #GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
     * @param params an array to receive the value of the queried parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>
     */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetRenderbufferParameteriv(target, pname, memAddress(params));
    }

    /**
     * Retrieves information about a bound renderbuffer object.
     *
     * @param target the target of the query operation. Must be:<br><table><tr><td>{@link #GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param pname  the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link #GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link #GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link #GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link #GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link #GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link #GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link #GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link #GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link #GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link #GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetRenderbufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetRenderbufferParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsFramebuffer ] ---

    /**
     * Determines if a name corresponds to a framebuffer object.
     *
     * @param framebuffer a value that may be the name of a framebuffer object
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsFramebuffer">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static native boolean glIsFramebuffer(@NativeType("GLuint") int framebuffer);

    // --- [ glBindFramebuffer ] ---

    /**
     * Binds a framebuffer to a framebuffer target.
     *
     * @param target      the framebuffer target of the binding operation. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param framebuffer the name of the framebuffer object to bind
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindFramebuffer">Reference Page</a>
     */
    public static native void glBindFramebuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer);

    // --- [ glDeleteFramebuffers ] ---

    /**
     * Unsafe version of: {@link #glDeleteFramebuffers DeleteFramebuffers}
     *
     * @param n the number of framebuffer objects to be deleted
     */
    public static native void nglDeleteFramebuffers(int n, long framebuffers);

    /**
     * Deletes framebuffer objects.
     *
     * @param framebuffers an array containing {@code n} framebuffer objects to be deleted
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteFramebuffers">Reference Page</a>
     */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") IntBuffer framebuffers) {
        nglDeleteFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
    }

    /**
     * Deletes framebuffer objects.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteFramebuffers">Reference Page</a>
     */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int framebuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer framebuffers = stack.ints(framebuffer);
            nglDeleteFramebuffers(1, memAddress(framebuffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenFramebuffers ] ---

    /**
     * Unsafe version of: {@link #glGenFramebuffers GenFramebuffers}
     *
     * @param n the number of framebuffer object names to generate
     */
    public static native void nglGenFramebuffers(int n, long framebuffers);

    /**
     * Generates framebuffer object names.
     *
     * @param framebuffers a buffer in which the generated framebuffer object names are stored
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenFramebuffers">Reference Page</a>
     */
    public static void glGenFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        nglGenFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
    }

    /**
     * Generates framebuffer object names.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenFramebuffers">Reference Page</a>
     */
    @NativeType("void")
    public static int glGenFramebuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer framebuffers = stack.callocInt(1);
            nglGenFramebuffers(1, memAddress(framebuffers));
            return framebuffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCheckFramebufferStatus ] ---

    /**
     * Checks the completeness status of a framebuffer.
     *
     * @param target the target of the framebuffer completeness check. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glCheckFramebufferStatus">Reference Page</a>
     */
    @NativeType("GLenum")
    public static native int glCheckFramebufferStatus(@NativeType("GLenum") int target);

    // --- [ glFramebufferTexture1D ] ---

    /**
     * Attaches a level of a 1D texture object as a logical buffer to the currently bound framebuffer object.
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param textarget  the type of texture
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFramebufferTexture1D">Reference Page</a>
     */
    public static native void glFramebufferTexture1D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFramebufferTexture2D ] ---

    /**
     * Attaches a level of a 2D texture object as a logical buffer to the currently bound framebuffer object.
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param textarget  the type of texture
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFramebufferTexture2D">Reference Page</a>
     */
    public static native void glFramebufferTexture2D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFramebufferTexture3D ] ---

    /**
     * Attaches a layer of a 3D texture object as a logical buffer to the currently bound framebuffer object.
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param textarget  the type of texture
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     * @param layer      the layer of a 2-dimensional image within the 3-dimensional texture.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFramebufferTexture3D">Reference Page</a>
     */
    public static native void glFramebufferTexture3D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

    // --- [ glFramebufferTextureLayer ] ---

    /**
     * Attaches a single layer of a texture to a framebuffer
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     * @param layer      the layer of {@code texture} to attach.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFramebufferTextureLayer">Reference Page</a>
     */
    public static native void glFramebufferTextureLayer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

    // --- [ glFramebufferRenderbuffer ] ---

    /**
     * Attaches a renderbuffer as a logical buffer to the currently bound framebuffer object.
     *
     * @param target             the framebuffer target. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment         the attachment point of the framebuffer. One of:<br><table><tr><td>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param renderbuffertarget the renderbuffer target. Must be:<br><table><tr><td>{@link #GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param renderbuffer       the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFramebufferRenderbuffer">Reference Page</a>
     */
    public static native void glFramebufferRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer);

    // --- [ glGetFramebufferAttachmentParameteriv ] ---

    /** Unsafe version of: {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv} */
    public static native void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params);

    /**
     * Retrievees information about attachments of a bound framebuffer object.
     *
     * @param target     the target of the query operation. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment within {@code target}. One of:<br><table><tr><td>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param pname      the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
     * @param params     an array to receive the value of the queried parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>
     */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFramebufferAttachmentParameteriv(target, attachment, pname, memAddress(params));
    }

    /**
     * Retrievees information about attachments of a bound framebuffer object.
     *
     * @param target     the target of the query operation. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link #GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link #GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment within {@code target}. One of:<br><table><tr><td>{@link #GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link #GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link #GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link #GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link #GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link #GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link #GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link #GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link #GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link #GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link #GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link #GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link #GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link #GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link #GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link #GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link #GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link #GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link #GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link #GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link #GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link #GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link #GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link #GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link #GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link #GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link #GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link #GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link #GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param pname      the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetFramebufferAttachmentParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetFramebufferAttachmentParameteriv(target, attachment, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBlitFramebuffer ] ---

    /**
     * Copies a block of pixels from the read framebuffer to the draw framebuffer.
     *
     * @param srcX0  the lower-left coordinate of the source rectangle within the read buffer
     * @param srcY0  the upper-left coordinate of the source rectangle within the read buffer
     * @param srcX1  the lower-right coordinate of the source rectangle within the read buffer
     * @param srcY1  the upper-right coordinate of the source rectangle within the read buffer
     * @param dstX0  the lower-left coordinate of the destination rectangle within the write buffer
     * @param dstY0  the upper-left coordinate of the destination rectangle within the write buffer
     * @param dstX1  the lower-right coordinate of the destination rectangle within the write buffer
     * @param dstY1  the upper-right coordinate of the destination rectangle within the write buffer
     * @param mask   the bitwise OR of the flags indicating which buffers are to be copied. One of:<br><table><tr><td>{@link GL11#GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link GL11#GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link GL11#GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr></table>
     * @param filter the interpolation to be applied if the image is stretched. One of:<br><table><tr><td>{@link GL11#GL_NEAREST NEAREST}</td><td>{@link GL11#GL_LINEAR LINEAR}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBlitFramebuffer">Reference Page</a>
     */
    public static native void glBlitFramebuffer(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

    // --- [ glGenerateMipmap ] ---

    /**
     * Generate mipmaps for a specified texture target.
     *
     * @param target the target to which the texture whose mimaps to generate is bound. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link #GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link #GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenerateMipmap">Reference Page</a>
     */
    public static native void glGenerateMipmap(@NativeType("GLenum") int target);

    // --- [ glTexParameterIiv ] ---

    /** Unsafe version of: {@link #glTexParameterIiv TexParameterIiv} */
    public static native void nglTexParameterIiv(int target, int pname, long params);

    /**
     * Sets the integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a single-valued texture parameter
     * @param params the value of {@code pname}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIiv(target, pname, memAddress(params));
    }

    /**
     * Sets the integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a single-valued texture parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIiv(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTexParameterIuiv ] ---

    /** Unsafe version of: {@link #glTexParameterIuiv TexParameterIuiv} */
    public static native void nglTexParameterIuiv(int target, int pname, long params);

    /**
     * Sets the unsigned integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a single-valued texture parameter
     * @param params the value of {@code pname}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIuiv(target, pname, memAddress(params));
    }

    /**
     * Sets the unsigned integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a single-valued texture parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIuiv(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterIiv ] ---

    /** Unsafe version of: {@link #glGetTexParameterIiv GetTexParameterIiv} */
    public static native void nglGetTexParameterIiv(int target, int pname, long params);

    /**
     * Returns the integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a texture parameter
     * @param params returns the texture parameter value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    public static void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIiv(target, pname, memAddress(params));
    }

    /**
     * Returns the integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a texture parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIiv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterIuiv ] ---

    /** Unsafe version of: {@link #glGetTexParameterIuiv GetTexParameterIuiv} */
    public static native void nglGetTexParameterIuiv(int target, int pname, long params);

    /**
     * Returns the unsigned integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a texture parameter
     * @param params returns the texture parameter value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    public static void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIuiv(target, pname, memAddress(params));
    }

    /**
     * Returns the unsigned integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a texture parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIuiv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glColorMaski ] ---

    /**
     * Enables and disables writing of frame buffer color components.
     *
     * @param buf the index of the draw buffer whose color mask to set
     * @param r   whether R values are written or not
     * @param g   whether G values are written or not
     * @param b   whether B values are written or not
     * @param a   whether A values are written or not
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glColorMaski">Reference Page</a>
     */
    public static native void glColorMaski(@NativeType("GLuint") int buf, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a);

    // --- [ glGetBooleani_v ] ---

    /** Unsafe version of: {@link #glGetBooleani_v GetBooleani_v} */
    public static native void nglGetBooleani_v(int target, int index, long data);

    /**
     * Queries the boolean value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     * @param data   a scalar or buffer in which to place the returned data
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetBooleani_v">Reference Page</a>
     */
    public static void glGetBooleani_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetBooleani_v(target, index, memAddress(data));
    }

    /**
     * Queries the boolean value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetBooleani_v">Reference Page</a>
     */
    @NativeType("void")
    public static boolean glGetBooleani(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer data = stack.calloc(1);
            nglGetBooleani_v(target, index, memAddress(data));
            return data.get(0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetIntegeri_v ] ---

    /** Unsafe version of: {@link #glGetIntegeri_v GetIntegeri_v} */
    public static native void nglGetIntegeri_v(int target, int index, long data);

    /**
     * Queries the integer value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     * @param data   a scalar or buffer in which to place the returned data
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetIntegeri_v">Reference Page</a>
     */
    public static void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetIntegeri_v(target, index, memAddress(data));
    }

    /**
     * Queries the integer value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetIntegeri_v">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetIntegeri(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetIntegeri_v(target, index, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glEnablei ] ---

    /**
     * Enables an indexed capability.
     *
     * @param cap   the indexed capability to enable
     * @param index the index to enable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glEnablei">Reference Page</a>
     */
    public static native void glEnablei(@NativeType("GLenum") int cap, @NativeType("GLuint") int index);

    // --- [ glDisablei ] ---

    /**
     * Disables an indexed capability.
     *
     * @param target the indexed capability to disable
     * @param index  the index to disable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDisablei">Reference Page</a>
     */
    public static native void glDisablei(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glIsEnabledi ] ---

    /**
     * Tests whether an indexed capability is enabled.
     *
     * @param target the indexed capability to query
     * @param index  the index to query
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsEnabledi">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static native boolean glIsEnabledi(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glBindBufferRange ] ---

    /**
     * Binds a range within a buffer object to an indexed buffer target.
     *
     * @param target the target of the bind operation. One of:<br><table><tr><td>{@link #GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td></tr></table>
     * @param index  the index of the binding point within the array specified by {@code target}
     * @param buffer a buffer object to bind to the specified binding point
     * @param offset the starting offset in basic machine units into the buffer object {@code buffer}
     * @param size   the amount of data in machine units that can be read from the buffer object while used as an indexed target
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindBufferRange">Reference Page</a>
     */
    public static native void glBindBufferRange(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glBindBufferBase ] ---

    /**
     * Binds a buffer object to an indexed buffer target.
     *
     * @param target the target of the bind operation. One of:<br><table><tr><td>{@link #GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td></tr></table>
     * @param index  the index of the binding point within the array specified by {@code target}
     * @param buffer a buffer object to bind to the specified binding point
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindBufferBase">Reference Page</a>
     */
    public static native void glBindBufferBase(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer);

    // --- [ glBeginTransformFeedback ] ---

    /**
     * Starts transform feedback operation.
     *
     * @param primitiveMode the output type of the primitives that will be recorded into the buffer objects that are bound for transform feedback. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBeginTransformFeedback">Reference Page</a>
     */
    public static native void glBeginTransformFeedback(@NativeType("GLenum") int primitiveMode);

    // --- [ glEndTransformFeedback ] ---

    /**
     * Ends transform feedback operation.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glEndTransformFeedback">Reference Page</a>
     */
    public static native void glEndTransformFeedback();

    // --- [ glTransformFeedbackVaryings ] ---

    /**
     * Unsafe version of: {@link #glTransformFeedbackVaryings TransformFeedbackVaryings}
     *
     * @param count the number of varying variables used for transform feedback
     */
    public static native void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode);

    /**
     * Specifies values to record in transform feedback buffers.
     *
     * @param program    the target program object
     * @param varyings   an array of {@code count} zero-terminated strings specifying the names of the varying variables to use for transform feedback
     * @param bufferMode the mode used to capture the varying variables when transform feedback is active. One of:<br><table><tr><td>{@link #GL_INTERLEAVED_ATTRIBS INTERLEAVED_ATTRIBS}</td><td>{@link #GL_SEPARATE_ATTRIBS SEPARATE_ATTRIBS}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTransformFeedbackVaryings">Reference Page</a>
     */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer varyings, @NativeType("GLenum") int bufferMode) {
        nglTransformFeedbackVaryings(program, varyings.remaining(), memAddress(varyings), bufferMode);
    }

    /**
     * Specifies values to record in transform feedback buffers.
     *
     * @param program    the target program object
     * @param varyings   an array of {@code count} zero-terminated strings specifying the names of the varying variables to use for transform feedback
     * @param bufferMode the mode used to capture the varying variables when transform feedback is active. One of:<br><table><tr><td>{@link #GL_INTERLEAVED_ATTRIBS INTERLEAVED_ATTRIBS}</td><td>{@link #GL_SEPARATE_ATTRIBS SEPARATE_ATTRIBS}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTransformFeedbackVaryings">Reference Page</a>
     */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] varyings, @NativeType("GLenum") int bufferMode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varyings);
            nglTransformFeedbackVaryings(program, varyings.length, varyingsAddress, bufferMode);
            org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, varyings.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Specifies values to record in transform feedback buffers.
     *
     * @param program    the target program object
     * @param bufferMode the mode used to capture the varying variables when transform feedback is active. One of:<br><table><tr><td>{@link #GL_INTERLEAVED_ATTRIBS INTERLEAVED_ATTRIBS}</td><td>{@link #GL_SEPARATE_ATTRIBS SEPARATE_ATTRIBS}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTransformFeedbackVaryings">Reference Page</a>
     */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence varying, @NativeType("GLenum") int bufferMode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varying);
            nglTransformFeedbackVaryings(program, 1, varyingsAddress, bufferMode);
            org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTransformFeedbackVarying ] ---

    /**
     * Unsafe version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying}
     *
     * @param bufSize the maximum number of characters, including the null terminator, that may be written into {@code name}
     */
    public static native void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name);

    /**
     * Retrieves information about varying variables selected for transform feedback.
     *
     * @param program the target program object
     * @param index   the index of the varying variable whose information to retrieve
     * @param length  a variable which will receive the number of characters written into {@code name}, excluding the null-terminator. If {@code length} is NULL no length is returned.
     * @param size    a variable that will receive the size of the varying
     * @param type    a variable that will receive the type of the varying
     * @param name    a buffer into which will be written the name of the varying
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>
     */
    public static void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetTransformFeedbackVarying(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    /**
     * Retrieves information about varying variables selected for transform feedback.
     *
     * @param program the target program object
     * @param index   the index of the varying variable whose information to retrieve
     * @param bufSize the maximum number of characters, including the null terminator, that may be written into {@code name}
     * @param size    a variable that will receive the size of the varying
     * @param type    a variable that will receive the type of the varying
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufSize);
            nglGetTransformFeedbackVarying(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Retrieves information about varying variables selected for transform feedback.
     *
     * @param program the target program object
     * @param index   the index of the varying variable whose information to retrieve
     * @param size    a variable that will receive the size of the varying
     * @param type    a variable that will receive the type of the varying
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetTransformFeedbackVarying(program, index, GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH), size, type);
    }

    // --- [ glBindVertexArray ] ---

    /**
     * Binds a vertex array object
     *
     * @param array the name of the vertex array to bind
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindVertexArray">Reference Page</a>
     */
    public static native void glBindVertexArray(@NativeType("GLuint") int array);

    // --- [ glDeleteVertexArrays ] ---

    /**
     * Unsafe version of: {@link #glDeleteVertexArrays DeleteVertexArrays}
     *
     * @param n the number of vertex array objects to be deleted
     */
    public static native void nglDeleteVertexArrays(int n, long arrays);

    /**
     * Deletes vertex array objects.
     *
     * @param arrays an array containing the n names of the objects to be deleted
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteVertexArrays">Reference Page</a>
     */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") IntBuffer arrays) {
        nglDeleteVertexArrays(arrays.remaining(), memAddress(arrays));
    }

    /**
     * Deletes vertex array objects.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteVertexArrays">Reference Page</a>
     */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int array) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arrays = stack.ints(array);
            nglDeleteVertexArrays(1, memAddress(arrays));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenVertexArrays ] ---

    /**
     * Unsafe version of: {@link #glGenVertexArrays GenVertexArrays}
     *
     * @param n the number of vertex array object names to generate
     */
    public static native void nglGenVertexArrays(int n, long arrays);

    /**
     * Generates vertex array object names.
     *
     * @param arrays a buffer in which the generated vertex array object names are stored
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenVertexArrays">Reference Page</a>
     */
    public static void glGenVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        nglGenVertexArrays(arrays.remaining(), memAddress(arrays));
    }

    /**
     * Generates vertex array object names.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenVertexArrays">Reference Page</a>
     */
    @NativeType("void")
    public static int glGenVertexArrays() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arrays = stack.callocInt(1);
            nglGenVertexArrays(1, memAddress(arrays));
            return arrays.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsVertexArray ] ---

    /**
     * Determines if a name corresponds to a vertex array object.
     *
     * @param array a value that may be the name of a vertex array object
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsVertexArray">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static native boolean glIsVertexArray(@NativeType("GLuint") int array);

    /**
     * Array version of: {@link #glClearBufferiv ClearBufferiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glClearBufferiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearBufferuiv ClearBufferuiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glClearBufferuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 4);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glClearBufferfv ClearBufferfv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glClearBufferfv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribI1iv VertexAttribI1iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI1iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI1iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribI2iv VertexAttribI2iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI2iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI2iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribI3iv VertexAttribI3iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI3iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI3iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribI4iv VertexAttribI4iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribI1uiv VertexAttribI1uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI1uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI1uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribI2uiv VertexAttribI2uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI2uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribI3uiv VertexAttribI3uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI3uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribI4uiv VertexAttribI4uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribI4sv VertexAttribI4sv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribI4usv VertexAttribI4usv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4usv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4usv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetVertexAttribIiv GetVertexAttribIiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniform1uiv Uniform1uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniform2uiv Uniform2uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniform3uiv Uniform3uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniform4uiv Uniform4uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetUniformuiv GetUniformuiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetUniformuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glDeleteRenderbuffers DeleteRenderbuffers}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteRenderbuffers">Reference Page</a>
     */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int[] renderbuffers) {
        long __functionAddress = GL.getICD().glDeleteRenderbuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /**
     * Array version of: {@link #glGenRenderbuffers GenRenderbuffers}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenRenderbuffers">Reference Page</a>
     */
    public static void glGenRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        long __functionAddress = GL.getICD().glGenRenderbuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>
     */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetRenderbufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glDeleteFramebuffers DeleteFramebuffers}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteFramebuffers">Reference Page</a>
     */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int[] framebuffers) {
        long __functionAddress = GL.getICD().glDeleteFramebuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /**
     * Array version of: {@link #glGenFramebuffers GenFramebuffers}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenFramebuffers">Reference Page</a>
     */
    public static void glGenFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        long __functionAddress = GL.getICD().glGenFramebuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>
     */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetFramebufferAttachmentParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, attachment, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glTexParameterIiv TexParameterIiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glTexParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glTexParameterIuiv TexParameterIuiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glTexParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTexParameterIiv GetTexParameterIiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    public static void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTexParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTexParameterIuiv GetTexParameterIuiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    public static void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTexParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetIntegeri_v GetIntegeri_v}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetIntegeri_v">Reference Page</a>
     */
    public static void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetIntegeri_v;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>
     */
    public static void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackVarying;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(program, index, name.remaining(), length, size, type, memAddress(name), __functionAddress);
    }

    /**
     * Array version of: {@link #glDeleteVertexArrays DeleteVertexArrays}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteVertexArrays">Reference Page</a>
     */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int[] arrays) {
        long __functionAddress = GL.getICD().glDeleteVertexArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

    /**
     * Array version of: {@link #glGenVertexArrays GenVertexArrays}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenVertexArrays">Reference Page</a>
     */
    public static void glGenVertexArrays(@NativeType("GLuint *") int[] arrays) {
        long __functionAddress = GL.getICD().glGenVertexArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

}