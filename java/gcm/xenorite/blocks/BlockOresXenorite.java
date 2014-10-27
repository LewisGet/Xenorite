package gcm.xenorite.blocks;

import gcm.xenorite.crativetab.CreativeTabBlocks;
import gcm.xenorite.reference.Reference;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOresXenorite extends BlockFalling
{
    public BlockOresXenorite()
    {
        this(Material.iron);
    }

    public BlockOresXenorite(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabBlocks.Xenoriteblocks);
        this.setStepSound(this.soundTypeStone);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
    
}