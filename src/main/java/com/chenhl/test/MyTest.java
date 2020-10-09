package com.chenhl.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @创建人: chenhl
 * @创建时间: 2020/9/26
 * @描述:
 */
public class MyTest {


    public static void main(String[] args) {
        String[] strs = {"8100111152007170953140934","8100111152007170953279133","8100111152007170953330014","8100111152007170953250345","8100111152007170953230700","8100111152007170953003647","8100111142007170953424778","8100111142007170953826444","8100111142007170953729912","8100111142007170953046228","8100111142007170953511349","8100111142007170953624860","8100111142007170953007521","8100111142007170953212893","8100111142007170953529270","8100111142007170953584031","8100111142007170953050818","8100111142007170953872507","8100111142007170953632157","8100111142007170953673236","8100111142007170953374072","8100111142007170953906153","8100111142007170953259809","8100111142007170953732957","8100111142007170953803085","8100111142007170953665901","8100111142007170953219045","8100111142007170953488908","8100111142007170953826394","8100111142007170953185188","8100111142007170953093062","8100111142007170953055922","8100111142007170953036853","8100111142007170953728961","8100111142007170953993809","8100111142007170953012266","8100111142007170953347016","8100111142007170953349826","8100111142007170953383500","8100111142007170953313889","8100111142007170953884943","8100111142007170953752882","8100111152007170953004500","8100111152007170953645890","8100111152007170953200017","8100111152007170953540741","8100111152007170953471662","8100111152007170953545747","8100111142007170953006814","8100111142007170953654276","8100111142007170953238269","8100111142007170953096094","8100111142007170953293141","8100111142007170953120550","8100111142007170953029692","8100111142007170953543695","8100111142007170953535428","8100111142007170953218518","8100111142007170953080840","8100111142007170953434603","8100111142007170953283443","8100111142007170953747134","8100111142007170953222468","8100111142007170953549078","8100111142007170953215056","8100111142007170953933638","8100111152007170953512302","8100111152007170953504149","8100111152007170953824037","8100111152007170953179108","8100111152007170953776547","8100111152007170953518182","8100111142007170953325711","8100111142007170953542962","8100111142007170953107701","8100111142007170953548352","8100111142007170953227049","8100111142007170953403645","8100111152007170953894245","8100111152007170953575229","8100111152007170953392780","8100111152007170953748899","8100111152007170953487274","8100111152007170953016680","8100111142007170953949532","8100111142007170953592099","8100111142007170953416324","8100111142007170953617770","8100111142007170953544991","8100111142007170953243931","8100111142007170953597650","8100111142007170953427379","8100111142007170953991442","8100111142007170953186152","8100111142007170953971570","8100111142007170953687258","8100111152007170953304846","8100111152007170953823856","8100111152007170953399780","8100111152007170953619080","8100111152007170953832253","8100111152007170953104073","8100111152007170953647908","8100111152007170953425590","8100111152007170953360617","8100111152007170953010576","8100111152007170953017938","8100111152007170953322766","8100111152007170953491027","8100111152007170953667227","8100111152007170953943941","8100111152007170953548597","8100111152007170953224225","8100111152007170953329402","8100111152007170953097734","8100111152007170953522065","8100111152007170953181522","8100111152007170953391658","8100111152007170953167369","8100111152007170953087924","8100111142007170953864928","8100111142007170953561610","8100111142007170953737282","8100111142007170953672043","8100111142007170953272271","8100111142007170953548691","8100111152007170953377781","8100111152007170953442232","8100111152007170953651891","8100111152007170953189330","8100111152007170953831115","8100111152007170953207930","8100111152007170953759950","8100111152007170953144826","8100111152007170953719415","8100111152007170953763081","8100111152007170953768526","8100111152007170953938181","8100111142007170953051079","8100111142007170953280060","8100111142007170953223331","8100111142007170953985208","8100111142007170953537057","8100111142007170953408686","8100111142007170953917687","8100111142007170953078116","8100111142007170953319465","8100111142007170953398627","8100111142007170953657304","8100111142007170953345146","8100111152007170953972127","8100111152007170953032673","8100111152007170953035779","8100111152007170953704260","8100111152007170953278928","8100111152007170953651008","8100111152007170953555875","8100111152007170953750663","8100111152007170953022191","8100111152007170953660805","8100111152007170953046036","8100111152007170953350998","8100111152007170953373331","8100111152007170953053420","8100111152007170953553898","8100111152007170953326165","8100111152007170953767664","8100111152007170953428816","8100111142007170953183309","8100111142007170953005664","8100111142007170953103909","8100111142007170953441836","8100111142007170953859407","8100111142007170953837169","8100111142007170953110234","8100111142007170953848674","8100111142007170953281509","8100111142007170953685299","8100111142007170953516248","8100111142007170953834233","8100111152007170953910555","8100111152007170953442168","8100111152007170953193577","8100111152007170953036548","8100111152007170953971709","8100111152007170953075111","8100111142007170953090489","8100111142007170953308553","8100111142007170953048211","8100111142007170953076723","8100111142007170953918752","8100111142007170953718919","8100111152007170953071491","8100111152007170953917525","8100111152007170953129777","8100111152007170953316443","8100111152007170953637839","8100111152007170953271446","8100111152007170953513588","8100111152007170953320342","8100111152007170953849741","8100111152007170953640196","8100111152007170953464555","8100111152007170953297157","8100111152007170953425023","8100111152007170953490509","8100111152007170953625731","8100111152007170953258794","8100111152007170953752839","8100111152007170953646384","8100111142007170953916680","8100111142007170953331684","8100111142007170953320240","8100111142007170953620313","8100111142007170953588021","8100111142007170953771598","8100111142007170953687277","8100111142007170953428897","8100111142007170953482017","8100111142007170953054316","8100111142007170953612295","8100111142007170953189377","8100111152007170953154061","8100111152007170953954137","8100111152007170953031235","8100111152007170953508923","8100111152007170953639066","8100111152007170953745506","8100111152007170953079322","8100111152007170953452608","8100111152007170953816482","8100111152007170953959264","8100111152007170953083325","8100111152007170953124677","8100111142007170953977036","8100111142007170953238186","8100111142007170953903565","8100111142007170953679262","8100111142007170953120623","8100111142007170953228501","8100111142007170953171291","8100111142007170953163315","8100111142007170953818967","8100111142007170953904279","8100111142007170953513367","8100111142007170953277062","8100111152007170953476829","8100111152007170953676473","8100111152007170953586238","8100111152007170953188761","8100111152007170953407540","8100111152007170953194824","8100111152007170953861179","8100111152007170953900352","8100111152007170953395452","8100111152007170953396747","8100111152007170953295425","8100111152007170953328756","8100111152007170953981922","8100111152007170953337360","8100111152007170953731523","8100111152007170953117430","8100111152007170953151799","8100111152007170953185622","8100111142007170953880774","8100111142007170953619573","8100111142007170953814055","8100111142007170953091161","8100111142007170953763966","8100111142007170953242241","8100111152007170953033026","8100111152007170953255183","8100111152007170953628595","8100111152007170953129700","8100111152007170953798037","8100111152007170953519244","8100111152007170953514449","8100111152007170953440136","8100111152007170953150815","8100111152007170953767930","8100111152007170953290310","8100111152007170953087087","8100111142007170953134257","8100111142007170953421080","8100111142007170953870844","8100111142007170953351598","8100111142007170953835138","8100111142007170953878630","8100111142007170953131902","8100111142007170953854083","8100111142007170953433461","8100111142007170953279447","8100111142007170953683220","8100111142007170953970104","8100111152007170953639936","8100111152007170953454557","8100111152007170953205430","8100111152007170953826204","8100111152007170953189485","8100111152007170953047567","8100111142007170953450865","8100111142007170953852893","8100111142007170953535480","8100111142007170953747220","8100111142007170953275992","8100111142007170953240464","8100111142007170953796241","8100111142007170953543653","8100111142007170953952623","8100111142007170953942564","8100111142007170953924662","8100111142007170953656019","8100111152007170953779751","8100111152007170953138662","8100111152007170953785727","8100111152007170953909491","8100111152007170953277833","8100111152007170953199872","8100111152007170953384437","8100111152007170953275753","8100111152007170953463921","8100111152007170953155561","8100111152007170953829508","8100111152007170953752935","8100111142007170953447103","8100111142007170953850650","8100111142007170953449926","8100111142007170953830095","8100111142007170953833108","8100111142007170953613994","8100111142007170953116955","8100111142007170953303710","8100111142007170953350932","8100111142007170953329164","8100111142007170953422678","8100111142007170953653952","8100111142007170953546827","8100111142007170953849722","8100111142007170953245106","8100111142007170953738659","8100111142007170953164388","8100111142007170953548819","8100111152007170953910708","8100111152007170953600130","8100111152007170953793348","8100111152007170953779005","8100111152007170953270966","8100111152007170953956365","8100111152007170953417531","8100111152007170953437567","8100111152007170953924770","8100111152007170953323365","8100111152007170953543065","8100111152007170953754661","8100111152007170953366068","8100111152007170953088604","8100111152007170953760762","8100111152007170953136935","8100111152007170953860414","8100111152007170953354331","8100111142007170953335863","8100111142007170953658243","8100111142007170953491011","8100111142007170953306365","8100111142007170953210773","8100111142007170953556260","8100111142007170953043563","8100111142007170953173419","8100111142007170953763646","8100111142007170953363772","8100111142007170953191917","8100111142007170953393684"};

        System.out.println(strs.length);

        List<String> list = Arrays.asList(strs).stream().distinct().collect(Collectors.toList());

        System.out.println(list.size());
    }
}