/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for the integer dot product SPIR-V instructions defined in SPV_KHR_integer_dot_product. These instructions are particularly useful for neural network inference and training but find uses in other general purpose compute applications as well.
 * 
 * <h5>VK_KHR_shader_integer_dot_product</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_shader_integer_dot_product}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>281</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Kevin Petit <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_shader_integer_dot_product:%20&amp;body=@kevinpetit%20">kevinpetit</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_shader_integer_dot_product.asciidoc">VK_KHR_shader_integer_dot_product</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-06-16</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_integer_dot_product.html">{@code SPV_KHR_integer_dot_product}</a>.</li>
 * <li>This extension interacts with {@link KHRShaderFloat16Int8 VK_KHR_shader_float16_int8}.</li>
 * </ul></dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Kévin Petit, Arm Ltd.</li>
 * <li>Jeff Bolz, NVidia</li>
 * <li>Spencer Fricke, Samsung</li>
 * <li>Jesse Hall, Google</li>
 * <li>John Kessenich, Google</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Einar Hov, Arm Ltd.</li>
 * <li>Stuart Brady, Arm Ltd.</li>
 * <li>Pablo Cascon, Arm Ltd.</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Jeff Leger, Qualcomm</li>
 * <li>Ruihao Zhang, Qualcomm</li>
 * <li>Pierre Boudier, NVidia</li>
 * <li>Jon Leech, The Khronos Group</li>
 * <li>Tom Olson, Arm Ltd.</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRShaderIntegerDotProduct {

    /** The extension specification version. */
    public static final int VK_KHR_SHADER_INTEGER_DOT_PRODUCT_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_SHADER_INTEGER_DOT_PRODUCT_EXTENSION_NAME = "VK_KHR_shader_integer_dot_product";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES_KHR   = 1000280000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR = 1000280001;

    private KHRShaderIntegerDotProduct() {}

}