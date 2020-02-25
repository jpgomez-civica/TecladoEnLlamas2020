export class Present {
    private length: number = 0;
    private width: number = 0;
    private height: number = 0;
    private area: number = 0;
    private areaRibbonWrap: number = 0;
    private areaRibbonBow: number = 0;
    private areaRibbon: number = 0;

    constructor(length: number, width: number, height: number) {
        this.length = length;
        this.width = width;
        this.height = height;

        const a = (this.length * this.width);
        const b = (this.width * this.height);
        const c = (this.height * this.length);
        const minor = a <= b && a <= c ? a : ( (b <= a && b <= c) ? b : c); 

        this.area = (2 * a) + (2 * b) + (2 * c) + minor;


        const aRibbon = ((this.length * 2) + (this.width * 2));
        const bRibbon = ((this.width * 2) + (this.height * 2));
        const cRibbon = ((this.height * 2) + (this.length * 2));

        this.areaRibbonWrap = aRibbon <= bRibbon && aRibbon <= cRibbon ? aRibbon 
        : ( (bRibbon <= aRibbon && bRibbon <= cRibbon) ? bRibbon : cRibbon);

        this.areaRibbonBow = (this.length * this.width * this.height);
        this.areaRibbon = this.areaRibbonBow + this.areaRibbonWrap;

    }

    public getArea() {
        return this.area;
    }

    public getAreaRibbon() {
        return this.areaRibbon;
    }

}
