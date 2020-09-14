package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler

class ExtraCells : Runnable {
    override fun run() {
        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 35)
        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 36)
        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 37)
        val item = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 38)
        val item2 = ItemBracketHandler.getItem("extracells:storage.component", 0)
        val item3 = ItemBracketHandler.getItem("extracells:storage.component", 1)
        val item4 = ItemBracketHandler.getItem("extracells:storage.component", 2)
        val item5 = ItemBracketHandler.getItem("extracells:storage.component", 3)
        val item6 = ItemBracketHandler.getItem("extracells:storage.component", 4)
        val item7 = ItemBracketHandler.getItem("extracells:storage.component", 5)
        val item8 = ItemBracketHandler.getItem("extracells:storage.component", 6)
        val item9 = ItemBracketHandler.getItem("extracells:storage.component", 7)
        val item10 = ItemBracketHandler.getItem("extracells:storage.component", 8)
        val item11 = ItemBracketHandler.getItem("extracells:storage.component", 9)
        val item12 = ItemBracketHandler.getItem("extracells:storage.component", 10)
        val item13 = ItemBracketHandler.getItem("extracells:storage.physical", 0)
        val item14 = ItemBracketHandler.getItem("extracells:storage.physical", 1)
        val item15 = ItemBracketHandler.getItem("extracells:storage.physical", 2)
        val item16 = ItemBracketHandler.getItem("extracells:storage.physical", 3)
        val item17 = ItemBracketHandler.getItem("extracells:storage.fluid", 0)
        val item18 = ItemBracketHandler.getItem("extracells:storage.fluid", 1)
        val item19 = ItemBracketHandler.getItem("extracells:storage.fluid", 2)
        val item20 = ItemBracketHandler.getItem("extracells:storage.fluid", 3)
        val item21 = ItemBracketHandler.getItem("extracells:storage.fluid", 4)
        val item22 = ItemBracketHandler.getItem("extracells:storage.fluid", 5)
        val item23 = ItemBracketHandler.getItem("extracells:storage.fluid", 6)
        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 39)
        val item24 = ItemBracketHandler.getItem("extracells:storage.casing", 0)
        val item25 = ItemBracketHandler.getItem("extracells:storage.casing", 1)
        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 23)
        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 22)
        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24)
        val ore = OreBracketHandler.getOre("circuitPrimitive")
        val ore2 = OreBracketHandler.getOre("circuitBasic")
        val ore3 = OreBracketHandler.getOre("circuitGood")
        val ore4 = OreBracketHandler.getOre("circuitAdvanced")
        val ore5 = OreBracketHandler.getOre("circuitData")
        val ore6 = OreBracketHandler.getOre("circuitElite")
        val ore7 = OreBracketHandler.getOre("circuitMaster")
        OreBracketHandler.getOre("circuitUltimate")
        val ore8 = OreBracketHandler.getOre("circuitSuperconductor")
        OreBracketHandler.getOre("circuitInfinite")
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32706)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32707)
        OreBracketHandler.getOre("screwQuartzite")
        val ore9 = OreBracketHandler.getOre("screwCertusQuartz")
        OreBracketHandler.getOre("screwNetherQuartz")
        val item26 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17516)
        OreBracketHandler.getOre("plateAluminium")
        val ore10 = OreBracketHandler.getOre("plateTitanium")
        OreBracketHandler.getOre("plateStainlessSteel")
        val ore11 = OreBracketHandler.getOre("plateChrome")
        OreBracketHandler.getOre("plateTungstenSteel")
        OreBracketHandler.getOre("plateHSLA")
        OreBracketHandler.getOre("plateAlloyIridium")
        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)
        val item27 = ItemBracketHandler.getItem("TConstruct:GlassPane", 0)
        val ore12 = OreBracketHandler.getOre("craftingToolScrewdriver")
        OreBracketHandler.getOre("craftingToolSoftHammer")
        val ore13 = OreBracketHandler.getOre("craftingToolHardHammer")
        MineTweakerAPI.recipes.remove(item13)
        MineTweakerAPI.recipes.remove(item14)
        MineTweakerAPI.recipes.remove(item15)
        MineTweakerAPI.recipes.remove(item16)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(item4)
        MineTweakerAPI.recipes.remove(item5)
        MineTweakerAPI.recipes.remove(item24)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:certustank", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:fluidcrafter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:pattern.fluid", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 11))
        MineTweakerAPI.recipes.remove(item17)
        MineTweakerAPI.recipes.remove(item18)
        MineTweakerAPI.recipes.remove(item19)
        MineTweakerAPI.recipes.remove(item20)
        MineTweakerAPI.recipes.remove(item21)
        MineTweakerAPI.recipes.remove(item22)
        MineTweakerAPI.recipes.remove(item23)
        MineTweakerAPI.recipes.remove(item6)
        MineTweakerAPI.recipes.remove(item7)
        MineTweakerAPI.recipes.remove(item8)
        MineTweakerAPI.recipes.remove(item9)
        MineTweakerAPI.recipes.remove(item10)
        MineTweakerAPI.recipes.remove(item11)
        MineTweakerAPI.recipes.remove(item12)
        MineTweakerAPI.recipes.remove(item25)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:ecbaseblock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:ecbaseblock", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:hardmedrive", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:vibrantchamberfluid", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.physical", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.fluid.portable", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:terminal.fluid.wireless", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:oc.upgrade", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:oc.upgrade", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:oc.upgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 14))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:part.base", 15))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.gas", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.gas", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.gas", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.gas", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.gas", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.gas", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.gas", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.component", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.component", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.component", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.component", 14))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.component", 15))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.component", 16))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.component", 17))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:storage.casing", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:craftingstorage", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:craftingstorage", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:craftingstorage", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("extracells:craftingstorage", 3))
        MineTweakerAPI.recipes.addShaped(item13, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore11, item2, ore11), arrayOf<IIngredient>(ore9, ore11, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item13, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore11, item2, ore11), arrayOf<IIngredient>(ore9, ore11, ore12)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:storage.physical", 0), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 0), ItemBracketHandler.getItem("extracells:storage.casing", 0)), null)
        MineTweakerAPI.recipes.addShaped(item14, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore11, item3, ore11), arrayOf<IIngredient>(ore9, ore11, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item14, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore11, item3, ore11), arrayOf<IIngredient>(ore9, ore11, ore12)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:storage.physical", 1), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 1), ItemBracketHandler.getItem("extracells:storage.casing", 0)), null)
        MineTweakerAPI.recipes.addShaped(item15, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore11, item4, ore11), arrayOf<IIngredient>(ore9, ore11, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item15, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore11, item4, ore11), arrayOf<IIngredient>(ore9, ore11, ore12)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:storage.physical", 2), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 2), ItemBracketHandler.getItem("extracells:storage.casing", 0)), null)
        MineTweakerAPI.recipes.addShaped(item16, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore11, item5, ore11), arrayOf<IIngredient>(ore9, ore11, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item16, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore11, item5, ore11), arrayOf<IIngredient>(ore9, ore11, ore12)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:storage.physical", 3), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 3), ItemBracketHandler.getItem("extracells:storage.casing", 0)), null)
        MineTweakerAPI.recipes.addShaped(item2, arrayOf(arrayOf(ore5, item, ore5), arrayOf<IIngredient>(item, ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemEmeraldCore", 0), item), arrayOf(ore5, item, ore5)), null)
        MineTweakerAPI.recipes.addShaped(item3, arrayOf(arrayOf(ore6, item2, ore6), arrayOf<IIngredient>(item2, ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemEmeraldCore", 0), item2), arrayOf(ore6, item2, ore6)), null)
        MineTweakerAPI.recipes.addShaped(item4, arrayOf(arrayOf(ore7, item3, ore7), arrayOf<IIngredient>(item3, ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0), item3), arrayOf(ore7, item3, ore7)), null)
        MineTweakerAPI.recipes.addShaped(item5, arrayOf(arrayOf(ore8, item4, ore8), arrayOf<IIngredient>(item4, ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0), item4), arrayOf(ore8, item4, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item24, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore11, item27, ore11), arrayOf<IIngredient>(ore9, ore11, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item24, arrayOf(arrayOf(ore12, item26, ore9), arrayOf(ore11, item27, ore11), arrayOf<IIngredient>(ore9, ore11, ore13)), null)
        MineTweakerAPI.recipes.addShaped(item17, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item6, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item17, arrayOf(arrayOf(ore12, item26, ore9), arrayOf(ore10, item6, ore10), arrayOf<IIngredient>(ore9, ore10, ore13)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:storage.fluid", 0), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 4), ItemBracketHandler.getItem("extracells:storage.casing", 1)), null)
        MineTweakerAPI.recipes.addShaped(item18, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item7, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item18, arrayOf(arrayOf(ore12, item26, ore9), arrayOf(ore10, item7, ore10), arrayOf<IIngredient>(ore9, ore10, ore13)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:storage.fluid", 1), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 5), ItemBracketHandler.getItem("extracells:storage.casing", 1)), null)
        MineTweakerAPI.recipes.addShaped(item19, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item8, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item19, arrayOf(arrayOf(ore12, item26, ore9), arrayOf(ore10, item8, ore10), arrayOf<IIngredient>(ore9, ore10, ore13)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:storage.fluid", 2), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 6), ItemBracketHandler.getItem("extracells:storage.casing", 1)), null)
        MineTweakerAPI.recipes.addShaped(item20, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item9, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item20, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item9, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:storage.fluid", 3), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 7), ItemBracketHandler.getItem("extracells:storage.casing", 1)), null)
        MineTweakerAPI.recipes.addShaped(item21, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item10, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item21, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item10, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:storage.fluid", 4), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 8), ItemBracketHandler.getItem("extracells:storage.casing", 1)), null)
        MineTweakerAPI.recipes.addShaped(item22, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item11, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item22, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item11, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:storage.fluid", 5), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 9), ItemBracketHandler.getItem("extracells:storage.casing", 1)), null)
        MineTweakerAPI.recipes.addShaped(item23, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item12, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item23, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item12, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:storage.fluid", 6), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 10), ItemBracketHandler.getItem("extracells:storage.casing", 1)), null)
        MineTweakerAPI.recipes.addShaped(item6, arrayOf(arrayOf(ore, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 8), ore), arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 8), ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorFluidDiamondCore", 0), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 8)), arrayOf(ore, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 8), ore)), null)
        MineTweakerAPI.recipes.addShaped(item7, arrayOf(arrayOf(ore2, item6, ore2), arrayOf<IIngredient>(item6, ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorFluidDiamondCore", 0), item6), arrayOf(ore2, item6, ore2)), null)
        MineTweakerAPI.recipes.addShaped(item8, arrayOf(arrayOf(ore3, item7, ore3), arrayOf<IIngredient>(item7, ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorFluidDiamondCore", 0), item7), arrayOf(ore3, item7, ore3)), null)
        MineTweakerAPI.recipes.addShaped(item9, arrayOf(arrayOf(ore4, item8, ore4), arrayOf<IIngredient>(item8, ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorFluidDiamondCore", 0), item8), arrayOf(ore4, item8, ore4)), null)
        MineTweakerAPI.recipes.addShaped(item10, arrayOf(arrayOf(ore5, item9, ore5), arrayOf<IIngredient>(item9, ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorFluidEmeraldCore", 0), item9), arrayOf(ore5, item9, ore5)), null)
        MineTweakerAPI.recipes.addShaped(item11, arrayOf(arrayOf(ore6, item10, ore6), arrayOf<IIngredient>(item10, ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorFluidEmeraldCore", 0), item10), arrayOf(ore6, item10, ore6)), null)
        MineTweakerAPI.recipes.addShaped(item12, arrayOf(arrayOf(ore7, item11, ore7), arrayOf<IIngredient>(item11, ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorFluidEmeraldCore", 0), item11), arrayOf(ore7, item11, ore7)), null)
        MineTweakerAPI.recipes.addShaped(item25, arrayOf(arrayOf(ore13, item26, ore9), arrayOf(ore10, item27, ore10), arrayOf<IIngredient>(ore9, ore10, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item25, arrayOf(arrayOf(ore12, item26, ore9), arrayOf(ore10, item27, ore10), arrayOf<IIngredient>(ore9, ore10, ore13)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("extracells:part.base", 3), arrayOf(arrayOf(OreBracketHandler.getOre("plateLapis"), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), OreBracketHandler.getOre("plateLapis")), arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 43), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 380), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 44)), arrayOf(OreBracketHandler.getOre("plateLapis"), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), OreBracketHandler.getOre("plateLapis"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("extracells:fluidcrafter", 0), arrayOf(arrayOf(OreBracketHandler.getOre("plateLapis"), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), OreBracketHandler.getOre("plateLapis")), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 4), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockMolecularAssembler", 0), ItemBracketHandler.getItem("extracells:storage.component", 4)), arrayOf(OreBracketHandler.getOre("plateLapis"), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), OreBracketHandler.getOre("plateLapis"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("extracells:ecbaseblock", 0), arrayOf(arrayOf(OreBracketHandler.getOre("plateLapis"), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), OreBracketHandler.getOre("plateLapis")), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:storage.component", 4), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockInterface", 0), ItemBracketHandler.getItem("extracells:storage.component", 4)), arrayOf(OreBracketHandler.getOre("plateLapis"), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), OreBracketHandler.getOre("plateLapis"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("extracells:ecbaseblock", 0), arrayOf<IIngredient>(ItemBracketHandler.getItem("extracells:part.base", 9)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("extracells:ecbaseblock", 1), arrayOf(arrayOf(OreBracketHandler.getOre("plateLapis"), ItemBracketHandler.getItem("extracells:part.base", 3), OreBracketHandler.getOre("plateLapis")), arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), ItemBracketHandler.getItem("extracells:fluidcrafter", 0), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16)), arrayOf(OreBracketHandler.getOre("plateLapis"), ItemBracketHandler.getItem("extracells:part.base", 4), OreBracketHandler.getOre("plateLapis"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("extracells:hardmedrive", 0), arrayOf(arrayOf(OreBracketHandler.getOre("plateDenseObsidian"), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 76), OreBracketHandler.getOre("plateDenseObsidian")), arrayOf(OreBracketHandler.getOre("plateDenseObsidian"), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDrive", 0), OreBracketHandler.getOre("plateDenseObsidian")), arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseLead"), OreBracketHandler.getOre("plateDenseLead"), OreBracketHandler.getOre("plateDenseLead"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("extracells:vibrantchamberfluid", 0), arrayOf(arrayOf(OreBracketHandler.getOre("plateLapis"), ItemBracketHandler.getItem("extracells:part.base", 3), OreBracketHandler.getOre("plateLapis")), arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockVibrationChamber", 0), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16)), arrayOf(OreBracketHandler.getOre("plateLapis"), ItemBracketHandler.getItem("extracells:certustank", 0), OreBracketHandler.getOre("plateLapis"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("extracells:storage.physical", 4), arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 35), null), arrayOf(OreBracketHandler.getOre("screwTitanium"), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockChest", 0), OreBracketHandler.getOre("screwTitanium")), arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 39), OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("extracells:storage.fluid.portable", 0), arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("extracells:storage.component", 4), null), arrayOf(OreBracketHandler.getOre("screwTitanium"), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockChest", 0), OreBracketHandler.getOre("screwTitanium")), arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockEnergyCell", 0), OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("OpenComputers:item", 32), arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32720)), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:certustank", 0), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzGlass", 0).amount(8), ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 8).amount(0), 800, 30)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:part.base", 0), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 260), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526).amount(3), 300, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:part.base", 1), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 240), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526).amount(3), 300, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:part.base", 2), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 220), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526).amount(3), 300, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:part.base", 4), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 280), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526), 100, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:part.base", 5), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 300), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526).amount(3), 300, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:part.base", 6), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 320), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526).amount(3), 300, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:part.base", 7), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDrive", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17306).amount(3), 300, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:part.base", 8), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockEnergyCell", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17306).amount(3), 300, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:part.base", 10), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 400), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526).amount(3), 300, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:part.base", 11), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 420), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526).amount(3), 300, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:pattern.fluid", 0), ItemBracketHandler.getItem("extracells:storage.casing", 1), ItemBracketHandler.getItem("minecraft:bucket", 0), 100, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:terminal.fluid.wireless", 0), ItemBracketHandler.getItem("appliedenergistics2:item.ToolWirelessTerminal", 32767), ItemBracketHandler.getItem("extracells:part.base", 3), 600, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:craftingstorage", 0), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0), ItemBracketHandler.getItem("extracells:storage.component", 0), 400, 1920)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:craftingstorage", 1), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0), ItemBracketHandler.getItem("extracells:storage.component", 1), 400, 1920)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:craftingstorage", 2), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0), ItemBracketHandler.getItem("extracells:storage.component", 2), 400, 1920)
        Assembler.addRecipe(ItemBracketHandler.getItem("extracells:craftingstorage", 3), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0), ItemBracketHandler.getItem("extracells:storage.component", 3), 400, 1920)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingStorage", 3), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 38), 400, 480)
    }
}